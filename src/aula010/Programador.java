package aula010;

public class Programador extends Pessoa {
		/* 	crie uma classe chamada Programador, que herda Pessoa e possui um
			atributo que indica a linguagem de programação preferida pelo programador.
			Crie os métodos de acesso deste atributo. */

	protected String linguagem;

	public Programador() {
		super();
	}

	public Programador(String nome, int idade, String linguagem) {
		super(nome, idade);
		this.linguagem = linguagem;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("=== PROGRAMADOR ===\n");
		super.imprimeDados();
        System.out.println("Linguagem preferida: " + getLinguagem());
        
    }
	
	
}
