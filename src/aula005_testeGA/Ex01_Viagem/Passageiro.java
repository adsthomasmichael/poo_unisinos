package aula005_testeGA.Ex01_Viagem;

public class Passageiro {
	
	/*	Crie uma classe Passageiro. Um passageiro possui um nome e uma idade. 
		Crie os	construtores que desejar, os métodos de acesso e um método que imprime as informações do passageiro. */

	private String nome;
	private int idade;
	
	public Passageiro( String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade( int idade) {
		this.idade = idade;
	}
	
	public void imprimeInfo() {
		System.out.println("Passageiro: ");
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: "+ getIdade());
	}
}
