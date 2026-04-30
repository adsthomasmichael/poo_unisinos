package aula009_ProvaGA;

public class Aluno {
	
	/* 	Crie uma classe Aluno. Um aluno possui um um nome, uma matrícula e um coeficiente de
		rendimento (valor entre 0.0 e 10.0). Crie os construtores que desejar, os métodos de acesso e um método
		que imprime as informações do aluno. */

	private String nome;
	private String matricula;
	private double coeficienteRend;
	
	public Aluno(String nome, String matricula, double coeficienteRend) {
		setNome(nome);
		setMatricula(matricula);
		setCoeficienteRend(coeficienteRend);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if( nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if( matricula != null && !matricula.trim().isEmpty()) {
			this.matricula = matricula;
		}
	}

	public double getCoeficienteRend() {
		return coeficienteRend;	
	}

	public void setCoeficienteRend(double coeficienteRend) {
		if(coeficienteRend >= 0.0 && coeficienteRend <= 10.0) {
			this.coeficienteRend = coeficienteRend;
		}
		else {
			this.coeficienteRend = 0.0;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("=== ALUNO ===\n");
		System.out.println("Nome               : "+ getNome());
		System.out.println("Matricula          : "+ getMatricula());
		System.out.println("Coef. de rendimento: "+ getCoeficienteRend());
	}
	
	
}
