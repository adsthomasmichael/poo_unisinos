package aula014;

public class Aluno {

	/* 	Crie a classe “Aluno” com os atributos do Exercício 1. Além dos métodos getters e
		setters de cada atributo, crie o método “visualizar()”, que deverá mostrar na
		tela os nomes e valores dos atributos no mesmo formato do Exercício 2. Instancie
		um aluno, defina seus atributos e visualize.*/
	
	protected String nome;
	protected String disciplina;
	protected double nota;
	
	
	public Aluno(String nome, String disciplina, double nota) {
		
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota = nota;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	public void visualizar() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Disciplina: "+ getDisciplina());
		System.out.println("Nota: "+ getNota());
		
	}
	
	
	
	
	
	
}
