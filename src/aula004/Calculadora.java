package aula004;

public class Calculadora {

	private String cor;
	private int memoria;
	
	public Calculadora( String cor, int memoria) {
		this.memoria = memoria;
		memoria = 0;
		
		this.cor = cor;
	}
	
	// Metodos de acesso GET
	public String getCor() {
		return cor;
	}
	
	public int getMemoria() {
		return memoria;
	}

	//Metodos de acesso SET
	public void setCor( String novaCor) {
		this.cor = novaCor;
	}
	
	public void setMemoria( int novaMemoria) {
		this.memoria = novaMemoria;
	}
	
	//Metodos aritmeticos
	public double soma( double v1, double v2) {
		double resultadoSoma = v1 + v2;
		return resultadoSoma;
	}
	
	public double subtrai( double v1, double v2) {
		double resultadoSubtrai = v1 - v2;
		return resultadoSubtrai;
	}
	
	public double multiplica( double v1, double v2) {
		double resultadoMultiplica = v1 * v2;
		return resultadoMultiplica;
	}
	
	public double divide( double v1, double v2) {
		double resultadoDivide = v1 / v2;
		return resultadoDivide;
	}
	
	//Metodos de potencia
	public int elevaAoQuadrado( int v1) {
		int resultadoQuadrado = (int) Math.pow(v1, 2);
		return resultadoQuadrado;
	}
	
	public int elevaAoCubo( int v1) {
		int resultadoCubo = (int) Math.pow(v1, 3);
		return resultadoCubo;
	}
	
	public void imprimeInfo() {
		System.out.println("A Calculadora possui:\n"
				+ "Cor: "+ getCor()+"\n"
				+ "Memoria: "+ getMemoria()+ "\n"
				);
	}
	
	
}
