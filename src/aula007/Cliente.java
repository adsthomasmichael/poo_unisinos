package aula007;

public class Cliente {

	private String nome;
	private int cnh;
	private int idade;
	private boolean experiente;//(motorista com CNH há mais de 10 anos é um motorista experiente).
	
	public Cliente() {} //construtor padrao
	
	public Cliente(String nome, int cnh, int idade, boolean experiente) {
		
		this.nome = nome;
		this.cnh = cnh;
		this.idade = idade;
		this.experiente = experiente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isExperiente() {
		return experiente;
	}

	public void setExperiente(boolean experiente) {
		this.experiente = experiente;
	}
	
	public void exibirInformacoes() {
		System.out.println("=== Cliente ===");
		System.out.println("Nome        : "+getNome());
		System.out.println("Idade       : "+getIdade());
		System.out.println("CNH         : "+getCnh());
		System.out.println("É experiente: "+isExperiente());
		
	}
	
}
