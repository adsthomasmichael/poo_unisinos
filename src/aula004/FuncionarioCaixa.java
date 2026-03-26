package aula004;

public class FuncionarioCaixa {
	
	private String nome;
	private String endereco;
	private char sexo;
	private Calculadora calculadora; 
	
	//Metodo construtor 1 - sem parametros, valores padrao:
	public FuncionarioCaixa() {
		this.nome = "Nome Padrão";
		this.endereco = "Av Padrão, n° S/N - Bairro Padrão";
		this.sexo = 'P';
		this.calculadora = new Calculadora("Cor Padrão");
	
	}	
	
	//Metodo construtor 2 - com parametros:
	public FuncionarioCaixa(String nome, String endereco, char sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.calculadora = new Calculadora("Preta");
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
	
	public Calculadora getCalculadora() {
		return calculadora;
	}
	
	//Metodos de acesso SET:
	public void setNome( String novoNome) {
		this.nome = novoNome;
	}
	
	public void setEndereco( String novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void setSexo( char novoSexo) {
		this.sexo = novoSexo;
	}
	
	public void setCalculadora( Calculadora novaCalculadora) {
		this.calculadora = novaCalculadora;
	}
	
	//Metodos aritimeticos
	
	public double soma(double v1, double v2) {
		return calculadora.soma(v1, v2);
	}
	
	public double subtrai(double v1, double v2) {
		return calculadora.subtrai(v1, v2);
	}
	
	public double multiplica( double v1, double v2) {
		return calculadora.multiplica(v1, v2);
	}
	
	public double divide( double v1, double v2) {
		return calculadora.divide(v1, v2);
	}
	
	public int elevaAoQuadrado( int v1) {
		return calculadora.elevaAoQuadrado(v1);
	}
	
	public int elevaAoCubo( int v1) {
		return calculadora.elevaAoCubo(v1);
	}
	
	public void imprimeInfo() {
		System.out.println("Dados do Funcionário:\nnome: "+ getNome());
		System.out.println("Endereço: "+ getEndereco());
		System.out.println("Sexo: "+ getSexo());
		System.out.println("Calculadora cor: "+ calculadora.getCor());
		System.out.println("Calculadora memoria: "+ calculadora.getMemoria());
	}



}

