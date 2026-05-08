package aula011;

public class Atleta {
	
	/* 	Crie uma classe Atleta, que possui um nome e uma idade. No construtor de
		Atleta, receba todos os parâmetros necessários para inicializar os atributos. Crie
		os métodos de acesso para os atributos e o método imprimeInfo, que não recebe
		parâmetros e imprime as informações do Atleta. */ 

	protected String nome;
	protected int idade;
	
	//contstrutores
	public Atleta() {}
	
	public Atleta(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimeInfo() {
		System.out.println("=== ATLETA ===");
		System.out.println("Nome : "+ getNome());
		System.out.println("Idade: "+getIdade());
	}
	
}
