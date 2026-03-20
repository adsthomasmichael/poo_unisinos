package aula003;

public class Aluno {

	/* 1 - Crie a classe Aluno com os seguintes atributos:
	- nome
	- matrícula
	- nota do grau A
	- nota do grau B */
	
	private String nome;
	private int matricula;
	private double notaGA;
	private double notaGB;
	
	// 2 - Crie os métodos de acesso e um construtor que recebe parâmetros para inicializar todos os atributos da classe.
	
	public Aluno(String nome, int matricula, double notaGA, double notaGB) { //método construtor
	
		this.nome = nome;
		this.matricula = matricula;
		this.notaGA = notaGA;
		this.notaGB = notaGB;
		
	}

	
		 // metodos de acesso Get -> busca e retorno
		public String getNome() {
			return nome;
		}
		
		public int getMatricula() {
			return matricula; 
		}
		
		public double getNotaGA() {
			return notaGA;
		}
		
		public double getNotaGB() {
			return notaGB;
		}

	
		// metodos de acesso Set -> altera o valor
		public void setNome( String novoNome) {
			this.nome = novoNome;
		}
		
		public void setMatricula( int novaMatricula) {
			this.matricula = novaMatricula;
		}
		
		public void setNotaGA( double novaNotaGA) {
			this.notaGA = novaNotaGA;
		}
		
		public void setNotaGB( double novaNotaGB) {
			this.notaGB = novaNotaGB;
		}
		
		
		/* 3 - Crie o método calculaMediaFinal(), que retorna a média final do aluno: 
		 * (GrauA * 0,33) + (GrauB * 0,67). */
		
		public double calculaMediaFinal() {
			double mediaFinal = ((notaGA * 0.33) + (notaGB * 0.67)) / 2;
			
			return mediaFinal;
		}

		
		/* 4 - Crie o método imprimeInfo(), que imprime todas as informações do aluno de	
		 maneira organizada, incluindo a sua média final .
		 */
		
		public void imprimeInfo() {
						
			System.out.printf("O aluno %s, identificado pela matricula de numero %d, obteve nota %.1f no Grau A e nota %.1f no grau B, obteve media final %.1f.\n",
							getNome(), 
							getMatricula(), 
							getNotaGA(), 
							getNotaGB(), 
							calculaMediaFinal()
							);
			
		}
	
}
