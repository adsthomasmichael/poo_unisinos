package aula010;

public class Aluno extends Pessoa {
	/* crie a classe Aluno, que herda Pessoa e possui um atributo nota. Crie os métodos de acesso para este atributo. */
	
	protected double nota;

	public Aluno() {
		super();
		
	}

	public Aluno(String nome, int idade, double nota) {
		super(nome, idade);
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("=== ALUNO ===\n");
		super.imprimeDados();
        System.out.println("NOta: " + getNota());
        
    }
	

}
