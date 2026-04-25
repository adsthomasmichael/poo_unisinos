package aula009_ProvaGA;

public class Inscricao {
	
	/* 	Crie uma classe Inscricao. Esta classe representa a inscrição de um aluno em uma
		disciplina. Uma inscrição possui um objeto do tipo Disciplina, um objeto do tipo Aluno e uma
		modalidade efetiva de inscrição (exemplo: “Regular com distinção”, “Regular”, “Especial”, “Ouvinte”). Crie
		os construtores que desejar, os métodos de acesso e um método que imprime as informações da
		inscrição. */

	private Disciplina disciplina;
	private Aluno aluno;
	private String modalidade;
	
	public Inscricao(Disciplina disciplina, Aluno aluno, String modalidade) {
		this.disciplina = disciplina;
		this.aluno = aluno;
		setModalidade(modalidade);
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		if( modalidade != null && modalidade.strip().isEmpty()) {
			this.modalidade = modalidade;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("=== INSCRIÇÃO ===\n");
		System.out.println("Disciplina: "+ getDisciplina());
		System.out.println("Aluno     : "+ getAluno());
		System.out.println("Modalidade: "+ getModalidade());
	}
	

}