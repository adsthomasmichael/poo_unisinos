package aula008;

import com.utils.Teclado;

public class Acervo {
	private Livro livro;
	private int qtdTotalLivros;
	
	public Acervo(Livro livro) {
		this.livro = livro;
		this.qtdTotalLivros = 0;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQtdTotalLivros() {
		return qtdTotalLivros;
	}

	public void setQtdTotalLivros(int qtdTotalLivros) {
		this.qtdTotalLivros = qtdTotalLivros;
	}
	
	public Livro cadastrarLivro(Livro livro) {
		if( livro != null) {
			System.out.println("Cadastro de novo livro realizado com sucesso.");
			setQtdTotalLivros(+1);			
		}
		else {
			System.out.println();
		}
	}
	
	
	

}
