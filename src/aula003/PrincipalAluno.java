package aula003;




public class PrincipalAluno {

	public static void main(String[] args) {
		/* A) Crie 3 alunos, conforme a descrição abaixo: 
		 
		 * 	Brandamente Brasil - 1585248 - 5 - 9
			Radigunda Cercená - 2254879 - 8 - 2
			Vitimado José Araújo - 0085994 - 7 - 1	*/

	Aluno a01 = new Aluno("Brandamente Brasil", 1585248, 5, 9 );
	Aluno a02 = new Aluno("Radigunda Cercená", 2254879, 8, 2);
	Aluno a03 = new Aluno("Vitimado José Araújo", 85994, 7, 1);
	
	
		/* B) Imprima as informações de cada um dos 3 alunos. */
	
	a01.imprimeInfo();
	a02.imprimeInfo();
	a03.imprimeInfo();
	
		// C) Altere a nota do Grau A de Radigunda para 9.
	
	a02.setNotaGA(9);
	
		// D) Imprima apenas a média final de Radigunda
	
	System.out.printf("A média final do/a alun/a %s é %.1f.\n", a02.getNome(), a02.calculaMediaFinal());
	
		// E) Imprima somente a matrícula de Vitimado.
	
	System.out.printf("O aluno %s possui matricula de numero %d.\n", a03.getNome(), a03.getMatricula());
	
		// F) Altere a matrícula de Brandamente para 1585228.
	
	a01.setMatricula(1585228);
	System.out.printf("Aluno %s teve alterado o numero de sua matricula para %d.", a01.getNome(), a01.getMatricula());
	
	
	}

	
		
	}


