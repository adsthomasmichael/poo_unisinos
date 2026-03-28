package aula005_testeGA.Ex02_Aquario;

public class cor {
	
	/* 	Crie a classe Cor, sabendo que:
		◦ uma cor possui um nome e 3 inteiros, chamados r, g e b; */
	
	private String nome;
	private int r;
	private int g;
	private int b;
	
	// ◦ quando uma cor é criada, todos os atributos devem ser inicializados;
	public cor(String nome, int r, int g, int b) {
		super();
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	// 	◦ crie os métodos de acesso para os atributos da classe Cor; 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	// ◦ crie o método toString, que retorna a cor na forma “Nome da cor (r, g, b)” 
	
	@Override
	public String toString() {
		return nome + "(" + r + "," + g + "," + b + ")";
	}
}
