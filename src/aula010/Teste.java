package aula010;

import com.utils.Teclado;

public class Teste {

	public static void main(String[] args) {
		/* 	Crie uma classe de Teste. Crie o método main nesta classe, e neste método crie
			uma Banana, uma Melancia, um Programador e um Aluno. Acesse os métodos
			para verificar seu funcionamento. */
		
		Banana b01 = new Banana("do Carrefour", "amarela", 2.68, 5.49, "Caturra");
		Melancia m01 = new Melancia("do Atacadão", "verde", 5.80, 6.90, 2.80, false);
		Programador p01 = new Programador("Luisito", 16, "Python");
		Aluno a01 = new Aluno("Angolinha", 4, 8.6);
		
		System.out.println("--- BANANA ---\n");
		System.out.println("Nome : "+ b01.getNome());
		System.out.println("Cor  : "+b01.getCor());
		System.out.println("Tipo : "+b01.getTipo());
		System.out.printf("Peso : %.2fkg",b01.getPeso());
		System.out.printf("\nPreço: R$ %.2f\n",b01.getPreco());
		
		System.out.println("\n--- MELANCIA ---\n");
		System.out.println("Nome: "+ m01.getNome());
		System.out.println("Cor: "+m01.getCor());
		System.out.printf("Peso: %.2fkg", m01.getPeso());
		System.out.printf("\nPreço: R$%.2f", m01.getPreco());
		System.out.printf("\nPreço final: R$%.2f\n", m01.calculaPrecoFinal());
	
		//Crie, no método main, uma Pessoa p.
		Pessoa p;
		
		//conforme a opção do usuário (o usuário digita via teclado), instancie a Pessoa para um Programador (caso digite 1) ou um Aluno (caso digite 2).
		int opcao = Teclado.leInt("Escolha a opção: \n"
				+ "1: Programador\n"
				+ "2: Aluno");
		/* se a Pessoa for um Programador, imprima sua linguagem de programação preferida. Caso a Pessoa seja um Aluno, imprima a nota referente a este aluno.*/
		if(opcao == 1) {
			p = new Programador("Michael Thomas", 42, "Java");
		}
		else {
			p = new Aluno("Luisito", 16, 8.7);
		}
		p.imprimeDados();
		
	
	
	}

}
