package aula009_ProvaGA;

public class Universidade {
	
	/* 	Crie uma classe Universidade. Uma universidade possui um nome e um atributo que
		armazena o total de inscrições realizadas (inicialize, no(s) construtor(es) este valor em zero). Crie os
		métodos de acesso e os construtores que desejar. */

	private String nome;
	private int totalInscricoes;
	
	public Universidade( String nome) {
		setNome(nome);
		setTotalInscricoes(totalInscricoes);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}

	public int getTotalInscricoes() {
		return totalInscricoes;
	}

	public void setTotalInscricoes(int totalInscricoes) {
		if(totalInscricoes >= 0) {
			this.totalInscricoes = totalInscricoes;
		}
	}
	
		/* (3.0 ponto) Na classe Universidade, crie um método chamado realizarInscricao, que recebe um
		objeto do tipo Aluno e um objeto do tipo Disciplina por parâmetro, simulando que o aluno vai se
		inscrever naquela disciplina. O método retorna um objeto do tipo Inscricao, de acordo com o que segue: */
	
	public Inscricao realizarInscricao(Aluno aluno, Disciplina disciplina) {
		
		if( aluno == null || disciplina == null) return null;
		
		/*a inscrição só pode ser realizada se ainda houver vagas na disciplina. Caso contrário, retorne null; */
		if(disciplina.getQtdMaximaVagas() < disciplina.getQtdVagasPreenchidas()) {
			System.out.println("Erro. Não ha vagas disponiveis.");
			return null;
		}
		
		/*  	alunos com coeficiente de rendimento abaixo de 4.0 são inscritos na modalidade “Especial” e só
				podem se inscrever em disciplinas cujo código comece com a letra “I” (disciplina introdutórias).
				Caso a disciplina não seja introdutória, retorne null e imprima uma mensagem explicando o
				motivo; */
		
		String modalidade;
		
		// 2. Definir modalidade
		double coef = aluno.getCoeficienteRend();
		
		if( coef < 4.0) {
			// Regra especial
			if(!disciplina.getCodigo().startsWith("I")) {
				System.out.println("Erro. Aluno com baixo rendimento pode somente se inscrever em disciplinas introdutorias.");
				return null;
			}
			modalidade = "Especial";
		}
		//alunos com coeficiente entre 4.0 (inclusive) e 6.0 (exclusive) são inscritos na modalidade “Ouvinte” - podem assistir as aulas, mas não recebem créditos;
		
		else if( coef < 6.0) {
			modalidade = "Ouvinte";
		}
		// alunos com coeficiente entre 6.0 (inclusive) e 8.0 (exclusive) são inscritos na modalidade “Regular”;
		else if( coef < 8.0) {
			modalidade = "Regular";
		}
		//alunos com coeficiente de 8.0 ou acima são inscritos na modalidade “Regular com distinção”
		else {
			modalidade = "Regular com distinção";
		}
		
		// criar inscrição
		Inscricao inscricao = new Inscricao(disciplina, aluno, modalidade);
		
		// Atualizando vagas da discilina		
		disciplina.setQtdVagasPreenchidas(disciplina.getQtdVagasPreenchidas() + 1);
		
		//Atualizando Universidade
		totalInscricoes++;
		
		return inscricao;
	
	}	
	
}
