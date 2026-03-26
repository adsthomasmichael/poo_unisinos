package aula004;

public class Empresa {
	
	private String nome;
	private FuncionarioCaixa funcionarioCaixa01;
	private FuncionarioCaixa funcionarioCaixa02;
	
	//Metodo construtor com parametros:
	public Empresa( String nome, FuncionarioCaixa funcionarioCaixa01, FuncionarioCaixa funcionarioCaixa02) {
		
		this.nome = nome;
		this.funcionarioCaixa01 = funcionarioCaixa01;
		this.funcionarioCaixa02 = funcionarioCaixa02;
		
	} 
	
	//Metodo construtor - recebe somente nome da empresa:
	public Empresa( String nome) {
	
		this.nome = nome;
		this.funcionarioCaixa01 = null;
		this.funcionarioCaixa02 = null;
	
	}
	
	//Metodo construtor - sem parametros - funcionarios null e nome da empresa "Padrão"
	public Empresa() {
		
		this.nome = "Nome Padrão";
		this.funcionarioCaixa01 = null;
		this.funcionarioCaixa02 = null;
	
	}
	
	//Metodos GET
	public String getNome() {
		return nome;
	}
	
	public FuncionarioCaixa getFuncionarioCaixa01() {
		return funcionarioCaixa01;
	}
	
	public FuncionarioCaixa getFuncionarioCaixa02() {
		return funcionarioCaixa02;
	}
	
	//Metodos SET
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setFuncionarioCaixa01(FuncionarioCaixa novoFuncionarioCaixa01) {
		this.funcionarioCaixa01 = novoFuncionarioCaixa01;
	} 
	
	public void setFuncionarioCaixa02( FuncionarioCaixa novoFuncionarioCaixa02) {
		this.funcionarioCaixa02 = novoFuncionarioCaixa02;
	}
	
	//Metodo imprime info:
	public void imprimeInfo() {
		System.out.println("Dados da empresa:");
		System.out.println("Nome: "+ getNome());
		
		System.out.println("Funcionario 1: ");
			if(getFuncionarioCaixa01()!= null) {
				getFuncionarioCaixa01().imprimeInfo();
			} else {
				System.out.println("Funcionario não cadastrado");
			}
				
		System.out.println("Funcionario 2: ");
			if (getFuncionarioCaixa02() != null) {
				getFuncionarioCaixa02().imprimeInfo();
			} else {
				System.out.println("Funcionario não cadastrado");
			}
	}
	
	
	
}
