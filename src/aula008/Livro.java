package aula008;

public class Livro {
	
	private String nome;
	private int qtdExemplar;
	private boolean disponibilidade;
	
	public Livro(String nome, int qtdExemplar) {
		
		this.nome = nome;
		this.qtdExemplar = qtdExemplar;
		this.disponibilidade = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdExemplar() {
		return qtdExemplar;
	}

	public void setQtdExemplar(int qtdExemplar) {
		this.qtdExemplar = qtdExemplar;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("=== Livro ===");
		System.out.println("Nome      			 : "+ getNome());
		System.out.println("Qtd exemplares       : "+ getQtdExemplar());
		System.out.println("\nDisponível  : "+ isDisponibilidade());
	}
	
	

}
