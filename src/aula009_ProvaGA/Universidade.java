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
		if(nome != null && nome.trim().isEmpty()) {
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
		int contaVagas = 0;
		Inscricao inscricao = new Inscricao(disciplina, aluno);
		
			/*a inscrição só pode ser realizada se ainda houver vagas na disciplina. Caso contrário, retorne null; */
			if(disciplina.getQtdMaximaVagas() <= 0) return null;
			
			/* 	alunos com coeficiente de rendimento abaixo de 4.0 são inscritos na modalidade “Especial” e só
				podem se inscrever em disciplinas cujo código comece com a letra “I” (disciplina introdutórias).
				Caso a disciplina não seja introdutória, retorne null e imprima uma mensagem explicando o
				motivo; */
		
			if( aluno.getCoeficienteRend() < 4.0) {
				inscricao.setModalidade("Especial");
				contaVagas++;
				if (!disciplina.getCodigo().startsWith("I")) {
					System.out.println("Erro! Você não pode se inscrever nesta disciplina. Inscreva-se em uma disciplina introdutória.");
					return null;
				}
			}
			
			/* 	alunos com coeficiente entre 4.0 (inclusive) e 6.0 (exclusive) são inscritos na modalidade “Ouvinte”
				– podem assistir as aulas, mas não recebem créditos; */
			if( aluno.getCoeficienteRend()>= 4.0 && aluno.getCoeficienteRend() < 6.0) {
				inscricao.setModalidade("Ouvinte");
				contaVagas++;
			}
			
			/* alunos com coeficiente entre 6.0 (inclusive) e 8.0 (exclusive) são inscritos na modalidade “Regular”; */
			if (aluno.getCoeficienteRend() >= 6.0 && aluno.getCoeficienteRend() < 8.0) {
				inscricao.setModalidade("Regular");
				contaVagas++;
			}
			//alunos com coeficiente de 8.0 ou acima são inscritos na modalidade “Regular com distinção”
			if (aluno.getCoeficienteRend() >= 8.0) {
				inscricao.setModalidade("Regular com distinção");
				contaVagas++;
			}
		
		disciplina.setQtdVagasPreenchidas(contaVagas);
		return inscricao;
	
	}
		
		
	
	
}
