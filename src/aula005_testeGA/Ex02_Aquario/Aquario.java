package aula005_testeGA.Ex02_Aquario;

public class Aquario {
	
	/* Crie a classe Aquario, sabendo que:
	◦ um aquário tem um tamanho em metros quadrados (do tipo double) e 3 peixes;*/

	private double tamanho;
	private Peixe peixe01;
	private Peixe peixe02;
	private Peixe peixe03;
	
	/* crie os seguintes construtores:
		▪ um que não recebe parâmetros e inicializa o tamanho com valor -1. */
	
	public Aquario() {
		this.tamanho = -1;
	}
	
	// um que recebe os parâmetros para inicializar todos os atributos
	public Aquario( double tamanho, Peixe peixe01, Peixe peixe02, Peixe peixe03) {
		this.tamanho = tamanho;
		this.peixe01 = peixe01;
		this.peixe02 = peixe02;
		this.peixe03 = peixe03;
	}
	
	//um que recebe apenas 1 peixe e o tamanho do aquário
	public Aquario( double tamanho, Peixe peixe01) {
		this.tamanho = tamanho;
		this.peixe01 = peixe01;
	}
	
	//um que recebe apenas 2 peixes e o tamanho do aquário
	public Aquario( double tamanho, Peixe peixe01, Peixe peixe02) {
		this.tamanho = tamanho;
		this.peixe01 = peixe01;
		this.peixe02 = peixe02;
	}
	
	//crie os métodos de acesso dos atributos desta classe;
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public Peixe getPeixe01() {
		return peixe01;
	}
	public void setPeixe01( Peixe peixe01) {
		this.peixe01 = peixe01;
	}
	
	public Peixe getPeixe02() {
		return peixe02;
	}
	public void setPeixe02( Peixe peixe02) {
		this.peixe02 = peixe02;
	}
	
	public Peixe getPeixe03() {
		return peixe03;
	}
	public void setPeixe03( Peixe peixe03) {
		this.peixe03 = peixe03;
	}
	
	//crie o método toString
	
	@Override
	public String toString(){
		
		int contaPeixe = 0;
			if ( peixe01 != null) {
				contaPeixe++;
			}
			if ( peixe02 != null ) {
				contaPeixe++;
			}
			if (peixe03 != null) {
				contaPeixe++;
			}
		
		if (contaPeixe == 1) {
			return "O Aquario possui de tamanho " + tamanho + "possui " + contaPeixe + " peixe: " + peixe01 + ".";
		}
		if (contaPeixe == 2) {
			return "O Aquario possui de tamanho " + tamanho + "possui " + contaPeixe + " peixes: " + peixe01 + ".\n" + peixe02 + ".";
		}
		else {
			return "O Aquario possui de tamanho " + tamanho + "possui " + contaPeixe + " peixes: " + peixe01 + ". \n" + peixe02 + ". \n" + peixe03 + ".";
		}
		
	}
	
	/* 	crie o método chamado tamanhoSuficiente, que retorna verdadeiro caso o tamanho do aquário
		seja suficiente para os peixes que estão no aquário e falso caso contrário. Para cada peixe que se
		encontra no aquário devem existir 3 metros quadrados exclusivos para ele. */
	
	public boolean tamanhoSuficiente() {
		
		int qtdPeixes = 0;
		int suficiente = qtdPeixes * 3;
			
			if ( peixe01 != null) {
				qtdPeixes++;
			}
			if ( peixe02 != null ) {
				qtdPeixes++;
			}
			if (peixe03 != null) {
				qtdPeixes++;
			}	
		
		if( suficiente < tamanho ) {
			return false;
		}
		else {
			return true;
		}
				
	}
	
	// crie o método imprimeCores, que imprime as cores dos peixes existentes no aquário.
	
	public void imprimeCores() {
		
		if(getPeixe03() != null) {
			System.out.println("A cor dos peixes são: \n"
					+ getPeixe01().getNome()+": "+ getPeixe01().getCor() + ".\n"
					+ getPeixe02().getNome()+": "+ getPeixe02().getCor() + ".\n"
					+ getPeixe03().getNome()+": "+ getPeixe03().getCor() + ".");
		}
		if(getPeixe02() != null) {
			System.out.println("A cor dos peixes são: \n"
					+ getPeixe01().getNome()+": "+ getPeixe01().getCor() + ".\n"
					+ getPeixe02().getNome()+": "+ getPeixe02().getCor() + ".");
		}
		if(getPeixe01() != null) {
			System.out.println("A cor dos peixes são: \n"
					+ getPeixe01().getNome()+": "+ getPeixe01().getCor() + ".");
		}
		else {
			System.out.println("Não tem peixe no aquario.");
		}
				
	}
	
}

