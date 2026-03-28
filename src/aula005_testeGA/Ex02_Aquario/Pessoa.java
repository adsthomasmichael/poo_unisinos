package aula005_testeGA.Ex02_Aquario;

public class Pessoa {
	/* 	Crie a classe Pessoa, sabendo que:
		◦ uma pessoa tem um nome e um aquário; */

	private String nome;
	private Aquario aquario;
	
	// quando uma pessoa é criada, o nome dela e o seu aquário devem ser informados;
	
	public Pessoa(String nome, Aquario aquario) {
		this.nome = nome;
		this.aquario = aquario;
	}
	
	// crie os métodos de acesso dos atributos desta classe;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aquario getAquario() {
		return aquario;
	}
	public void setAquario( Aquario aquario) {
		this.aquario = aquario;
	}

 // crie o método toString
	@Override
	public String toString() {
		return nome + " possui " + aquario + ".";
	}


}
