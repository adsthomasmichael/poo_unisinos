package aula005_testeGA.Ex02_Aquario;

public class Peixe {
	
	/* 	Crie a classe Peixe, sabendo que:
		◦ cada peixe tem um nome, uma cor (do tipo Cor) e uma raça; */
	private String nome;
	private Cor cor;
	private String raca;
		
	// quando um peixe é criado, o nome, a cor e a raça devem ser informados;
	public Peixe(String nome, Cor cor, String raca) {
		
		this.nome = nome;
		this.cor = cor;
		this.raca = raca;
	}
	
	// crie os métodos de acesso para os atributos da classe Peixe;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor( Cor cor) {
		this.cor = cor;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

	// crie o método toString.
	
	@Override
	public String toString() {
		return "O peixe de nome " + nome + " tem a cor " + cor + " e é da raça " + raca + ".";
	}

}
