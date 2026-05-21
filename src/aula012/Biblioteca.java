package aula012;

import java.util.Arrays;

public class Biblioteca {
    /* Crie uma classe Biblioteca, que possui um array de Livro. Crie os métodos de acesso e o toString para esta classe.
    Nesta classe, ainda, faça o que se pede:*/

    protected Livro[] arrayLivro;

    //  A - no construtor, receba apenas o tamanho do array de Livro por parâmetro e inicialize o array com este tamanho.
    // Não inclua livros no array, ele deve permanecer vazio no momento da criação da biblioteca.


    public Biblioteca( int tamanho) {
        this.arrayLivro = new Livro[tamanho];
    }

    public Livro[] getArrayLivro() {
        return arrayLivro;
    }

    public void setArrayLivro(Livro[] arrayLivro) {
        this.arrayLivro = arrayLivro;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "arrayLivro=" + Arrays.toString(arrayLivro) +
                '}';
    }
    // B - crie o metodo insereLivro, que recebe um livro e insere na primeira posição disponível do array.
    //  Caso não seja possível inserir o livro no array, retorne false. Se o livro for inserido, retorne true. */

    public boolean insereLivro( Livro livro){
        for ( int i = 0; i < arrayLivro.length; i++){
            if ( arrayLivro[i] == null){
                arrayLivro[i] = livro;
                return true;
            }
        }
        return false;
    }

    // C - crie o metodo procuraLivroPorTitulo, que recebe uma String titulo e retorna um objeto do tipo Livro,
    // que é o livro com aquele título. O metodo retorna null caso não haja o livro solicitado na biblioteca.

    public Livro procuraLivroPorTitulo( String titulo){
        for ( int i = 0; i < arrayLivro.length; i++){
            if (arrayLivro[i] != null) {
                if ( arrayLivro[i].getTitulo().equals(titulo)){
                    return arrayLivro[i];
                }

            }
        }
        return null;
    }
    // D - crie o metodo verificaDesconto, que recebe uma String titulo e retorna o valor do desconto do livro
    // com o título solicitado caso o livro esteja na biblioteca ou retorna -1, caso contrário.
    // Cuidado, nem todos os tipos de livro possuem desconto.

    public double verificaDesconto(String titulo){
        for (int i = 0; i < arrayLivro.length; i++){
            if (arrayLivro[i] != null &&
            	arrayLivro[i].getTitulo().equals(titulo) &&
            	arrayLivro[i] instanceof Novo){
                    Novo livroNovo = (Novo) arrayLivro[i];
                    return livroNovo.getValorDesconto();
                }
            }
        	return -1;
        }
        
    
    // E - crie o metodo imprimeEdicoes, que imprime as edições de todos os livros que possuem esta informação.
    public void imprimeEdicoes(){
        for (int i = 0; i < arrayLivro.length; i++){
            if (arrayLivro[i] != null){
                if (arrayLivro[i] instanceof Antigo){
                    Antigo livroAntigo = (Antigo) arrayLivro[i];
                    System.out.println(livroAntigo.getNumEdicao());
                }
            }
        }
    }

    // F - crie o metodo imprimeLivroPorAno, que simplesmente imprime as informações dos livros em ordem decrescente de ano de criação
    public void imprimeLivroPorAno() {
        // Começa com o maior valor inteiro possível. Assim, na primeira rodada, qualquer ano de livro será menor que esse valor.
        int ultimoAnoImpresso = Integer.MAX_VALUE;

        // Repete até que não existam mais livros para imprimir.
        while (true) {

            // Variável que armazenará o livro mais recente encontrado na rodada atual.
            Livro livroMaisRecente = null;

            // Percorre todas as posições do array.
            for (int i = 0; i < arrayLivro.length; i++) {

                // Verifica se existe um livro nesta posição.
                if (arrayLivro[i] != null) {

                    // Obtém o ano do livro atual.
                    int ano = arrayLivro[i].getAno();

                    // Considera apenas livros com ano menor que o último já impresso. Isso evita imprimir o mesmo livro novamente.
                    if (ano < ultimoAnoImpresso) {

                        // Se ainda não existe um candidato, ou se o livro atual é mais recente que o candidato, ele passa a ser o novo candidato.
                        if (livroMaisRecente == null ||
                            ano > livroMaisRecente.getAno()) {

                            livroMaisRecente = arrayLivro[i];
                        }
                    }
                }
            }

            // Se nenhum livro foi encontrado nesta rodada, significa que todos já foram impressos.
            if (livroMaisRecente == null) {
                break; // encerra o while
            }

            // Imprime o livro mais recente encontrado.
            System.out.println(livroMaisRecente);

            // Atualiza o ano limite. Na próxima rodada, serão considerados apenas livros com ano menor que este.
            ultimoAnoImpresso = livroMaisRecente.getAno();
        }
    }
    
    /*public void imprimeLivroPorAno() {
        // Cria um novo array com o mesmo tamanho do array original. Esse array será usado para ordenar os livros sem alterar
        // a ordem do arrayLivro da biblioteca.
        Livro[] copia = new Livro[arrayLivro.length];

        // Copia todos os elementos do array original para o array copia.
        for (int i = 0; i < arrayLivro.length; i++) {
            copia[i] = arrayLivro[i];
        }

        // Início do Bubble Sort. Esse laço controla quantas passadas serão feitas no array.
        for (int i = 0; i < copia.length - 1; i++) {

            // Percorre o array comparando elementos vizinhos. O "- i" evita comparar posições já organizadas.
            for (int j = 0; j < copia.length - 1 - i; j++) {

                // Só compara se ambas as posições contiverem livros.
                if (copia[j] != null && copia[j + 1] != null) {

                    // Se o livro da posição j for mais antigo que o da posição j+1, eles trocam de lugar.
                    // Assim, os livros mais recentes "sobem" para o início do array.
                    if (copia[j].getAno() < copia[j + 1].getAno()) {

                        // Variável temporária para realizar a troca.
                        Livro temp = copia[j];

                        // Move o livro da posição j+1 para j.
                        copia[j] = copia[j + 1];

                        // Coloca o livro que estava em j na posição j+1.
                        copia[j + 1] = temp;
                    }
                }
            }
        }

        // Percorre o array já ordenado.
        for (int i = 0; i < copia.length; i++) {

            // Imprime apenas as posições que contêm livros.
            if (copia[i] != null) {
                System.out.println(copia[i]);
            }
        }
    } */
    
    // G - crie o método calculaMediaPreco, que retorna a média dos preços dos livros presentes no array
    
    public double calculaMediaPreco() {
    
    double mediaPrecos = 0;
    int qtdLivros = 0;
    
    double somaPrecos = 0;
    
    	for (int i = 0; i < arrayLivro.length; i++) {
    		if( arrayLivro[i] != null) {
    			somaPrecos += arrayLivro[i].getPreco();
    			qtdLivros++;
    		}
    	}
    	
    	if (qtdLivros == 0) {
	        return 0;
	    }
    return somaPrecos / qtdLivros;    	
    
    }
    
    /* H - crie o método livroComMaiorTitulo, que retorna o livro com o maior título doarray. 
     * Utilize o método length() da classe String, que retorna o tamanho do texto. 
     * Por exemplo: variavelString.length() retorna o tamanho (ou seja, a quantidade de caracteres) da variável variavelString. */
    
    public Livro livroComMaiorTitulo() {
    	
    	int maiorTitulo = 0;
    	Livro livroMaiorTitulo = null;
    	
    	for( int i = 0; i < arrayLivro.length; i++) {
    		if( arrayLivro[i] != null) {
    			if( arrayLivro[i].getTitulo().length() > maiorTitulo) {
    				maiorTitulo = arrayLivro[i].getTitulo().length();
    				livroMaiorTitulo = arrayLivro[i];
    			}
    			
    		}
    		
    	}
    	return livroMaiorTitulo;
    }



}
