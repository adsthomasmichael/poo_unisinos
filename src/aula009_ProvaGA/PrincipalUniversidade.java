package aula009_ProvaGA;

import com.utils.Teclado;

import aula007.Cliente;

public class PrincipalUniversidade {

	public static void main(String[] args) {
		/* Crie uma classe PrincipalUniversidade. Nesta classe, crie o método main. No main, faça o que se pede:
		 * crie uma universidade, com o nome informado pelo Teclado; */
		
		Universidade u1 = new Universidade(
				Teclado.leString("Informe o nome da Universidade: ")
		);
		
		// crie duas disciplinas, uma introdutória e outra avançada, com 4 e 5 vagas, respectivamente
		Disciplina d1 = new Disciplina("INF101", 4);
		Disciplina d2 = new Disciplina("ALG201", 5);
		
		/* 	Tente realizar a inscrição de 8 alunos diferentes (com nomes, matrículas e coeficientes variados,
			incluindo casos que cubram todas as modalidades e ao menos um caso de vaga esgotada).
			Imprima as informações de cada inscrição realizada com sucesso, ou uma mensagem de erro para
			cada inscrição não efetuada.*/
		
	/*	Aluno a1 = new Aluno("Michael Thomas", "123456", 8.1);
		Aluno a2 = new Aluno("Luisinho Eduardo", "123457", 6.1);
		Aluno a3 = new Aluno("Angolinha da Silva", "123458", 5.1);
		Aluno a4 = new Aluno("D'Alessando Jardim", "123459", 4.1);
		Aluno a5 = new Aluno("Tatiani Jardim", "123450", 3.1);
		Aluno a6 = new Aluno("Donaldo Luiz", "123451", 2.1);
		Aluno a7 = new Aluno("Naira Cafifa", "123452", 1.1);
		Aluno a8 = new Aluno("Ivone Maria", "1234563", 9.1); */
		
		Aluno[] alunos = {
				new Aluno("Michael Thomas", "123456", 8.1),
				new Aluno("Luís Eduardo", "123457", 6.1),
				new Aluno("ngolinha da Silva", "123458", 5.1),
				new Aluno("D'Alessando Jardim", "123459", 4.1),
				new Aluno("Tatiani Jardim", "123450", 3.1),
				new Aluno("Donaldo Luiz", "123451", 2.1),
				new Aluno("Naira Cafifa", "123452", 1.1),
				new Aluno("Ivone Maria", "1234563", 9.1),
				new Aluno("Vande Bigode", "1234564", 7.1),				
		};
		
		System.out.println("\n=== INSCRIÇÕES EM INF101 ===\n");
		
		for( Aluno a : alunos) {
			Inscricao i = u1.realizarInscricao(a, d1);
				
			if ( i != null) {
				i.exibirInformacoes();
			}
			else {
				System.out.println("Falha na inscrição do aluno "+ a.getNome());
			}
			
			System.out.println("-------------------------");
		}
	
		
		System.out.println("\n=== INSCRIÇÕES EM ALG201  ===\n");
		
		for( Aluno a : alunos) {
			Inscricao i = u1.realizarInscricao(a, d2);
				
			if ( i != null) {
				i.exibirInformacoes();
			}
			else {
				System.out.println("Falha na inscrição do aluno "+ a.getNome());
			}
			
			System.out.println("-------------------------");
		}
	
		System.out.println("\nTotal de inscrições: " + u1.getTotalInscricoes());
		
	}

}
