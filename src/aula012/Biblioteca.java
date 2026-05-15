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
            if (arrayLivro[i] != null){
                if (arrayLivro[i] instanceof Novo){
                    Novo livroNovo = (Novo) arrayLivro[i];
                    return livroNovo.getValorDesconto();
                }
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
                    livroAntigo.toString();
                }
            }
        }
    }

    // F - crie o metodo imprimeLivroPorAno, que simplesmente imprime as informações dos livros em ordem decrescente de ano de criação
    public void imprimeLivroPorAno(){
        for (int i = 0; i < arrayLivro.length; i++){
            if (arrayLivro[i] != null){
                if (arrayLivro[i].getAno() > arrayLivro[i + 1].getAno()){
                    arrayLivro[i].toString();
                }
                else arrayLivro[i + 1].toString();
            }
        }
    }



}
