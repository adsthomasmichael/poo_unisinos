package aula012;

import com.utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		/* A - 	Crie uma biblioteca com capacidade de livros entre 1 e 200, utilizando Math.random() para o sorteio. 
			 	Lembrando: (int)(Math.random() * X + 1) sorteia um valor entre 1 e X. */
		Biblioteca biblioteca01 = new Biblioteca((int)(Math.random()* 200 + 1));
	
		// B - Sorteie um valor entre 1 e 300 e armazene em uma variável chamada quant.
		int quant = (int)(Math.random() * 300 + 1);
		
		/* C - Tente inserir quant livros na biblioteca. Para isto, realize um sorteio entre 1 e 2.
		 * Caso o valor sorteado seja 1, insira um livro Novo. Caso o valor sorteado seja 2, insira um livro Antigo. 
		 * A cada inserção, informe uma mensagem de sucesso ou insucesso. As informações necessárias para criação dos objetos devem ser obtidas de alguma forma aleatória. */

		for (int i = 0; i < quant; i++) {

		    // Sorteia 1 ou 2
		    int tipoLivro = (int)(Math.random() * 2 + 1);

		    // Dados comuns a qualquer livro
		    String titulo = "Livro " + i;
		    String autor = "Autor " + i;
		    double preco = Math.random() * 100;
		    int ano = (int)(Math.random() * 126 + 1900);

		    boolean inseriu;

		    if (tipoLivro == 1) {
		        // Cria um livro Novo
		        double desconto = Math.random() * 50;

		        Novo livro = new Novo(
		                titulo,
		                autor,
		                preco,
		                ano,
		                desconto
		        );

		        inseriu = biblioteca01.insereLivro(livro);

		    } else {
		        // Cria um livro Antigo
		        int edicao = (int)(Math.random() * 10 + 1);

		        Antigo livro = new Antigo(
		                titulo,
		                autor,
		                preco,
		                ano,
		                edicao
		        );

		        inseriu = biblioteca01.insereLivro(livro);
		    }

		    // Informa o resultado da inserção
		    if (inseriu) {
		        System.out.println("Livro inserido com sucesso.");
		    } else {
		        System.out.println("Não foi possível inserir o livro.");
		    }
		}
	
	/* D - Solicite ao usuário (pelo teclado) que informe o título de um livro para procurar na biblioteca. Caso o livro exista, 
	 * 		imprima as informações do livro. Caso contrário, imprima uma mensagem de erro. */
	
	String tituloProcurado = Teclado.leString("Informe o titulo do livro: ");
	Livro livro = biblioteca01.procuraLivroPorTitulo(tituloProcurado);
		if( livro != null) {
			System.out.println(livro);
		}
		else {
			System.out.println("ERRO! O livro pesquisado não foi localizado.");
		}
		
		
	/* E - Solicite ao usuário (pelo teclado) que informe o título de um livro para verificar o desconto. 
	 * Caso o livro exista e possua desconto, imprima as informações do livro. Caso contrário, imprima uma mensagem de erro. */

		String tituloProcuraDesconto = Teclado.leString("Informe o Titulo do livro para verificar desconto: ");
		Livro livroDesc = biblioteca01.procuraLivroPorTitulo(tituloProcuraDesconto);
			if( livroDesc != null) {
				if( biblioteca01.verificaDesconto(tituloProcuraDesconto) != -1) {
					System.out.println(livroDesc);
				}
				else {
					System.out.println("Este livro não possui desconto.");
				}
			}
			else {
				System.out.println("ERRO! Livro pesquisado não foi localizado.");
			}
	
	
	
	}

}
