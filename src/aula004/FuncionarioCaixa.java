package aula004;

public class FuncionarioCaixa {
	
	private String nome;
	private String endereco;
	private char sexo;
	private Calculadora; //Não entendi esta parte. A classe FuncionárioCaixa possui um atributo chamado Calculadora ou é um metodo da Classe Calculadora?
	
	//Metodo construtor 1:
	public FuncionarioCaixa() {
		this.nome = "Nome Padrão";
		this.endereco = "Av Padrão, n° S/N - Bairro Padrão";
		this.sexo = 'P';
	
	}	
	
	//Metodo construtor 2:
	public FuncionarioCaixa(String nome, String endereco, char sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
	}
	
	//Metodos de acesso GET:
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	//Metodos de acesso SET:
	public void setNome( String novoNome) {
		this.nome = novoNome;
	}
	
	public void setEndereco( String novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void setSexo( char novoSexo) {
		this.sexo = novo
	}
	
	

}
