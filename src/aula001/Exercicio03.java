package aula001;

import com.utils.Teclado;


public class Exercicio03 {

	public static void main(String[] args) {
		
		/*03 - Escreva um método que leia 10 valores double do teclado e armazene-os em uma matriz de
			dimensões 2x5. Seu método deve retornar esta matriz. 
		
		
	double[][] retornoMatriz = exercicio03();
	
		for( int i = 0; i < retornoMatriz.length; i++) {
			for( int j = 0; j < retornoMatriz[i].length; j++) {
				System.out.print(retornoMatriz[i][j] + " ");
			}System.out.println();
		} */
		
		
		/*-------------------------------------------------------------------------------------------------
		
		 04 - Crie um método que recebe um array bidimensional de double e retorna a quantidade de
			elementos deste array. 
		
		int linha = Teclado.leInt("Informe a quantidade de linhas: ");
		int coluna = Teclado.leInt("Agora informe a quantidade de colunas: ");
		
		double[][] matriz04 = new double[linha][coluna];
		
			for( int i = 0; i < matriz04.length; i++) {
				for( int j = 0; j < matriz04[i].length; j++) {
					matriz04[i][j] = Teclado.leDouble("Informe o valor para a posição["+ i + "]["+ j + "]: ");
				}
			}
			int retornoQtd = exercicio04(matriz04);
			System.out.println("A quantidade de elementos na Matriz é: " + retornoQtd); */
			
		/*----------------------------------------------------------------------------------------------------
		 
		 05 - Crie um método que recebe uma matriz de double e retorna um String de saída para ela,
			com seus valores separados por um hífen, mas mantendo o formato da matriz. 

		double[][] matriz05 = {
				{2.5, 5.6, 76.3, 98.0},
				{7.9, 4.4, 1.0, 19.4},
				{3.4, 21.0, 12.6, 54.3}
				};
		
		System.out.println(exercicio05(matriz05)); */
		
		
		/*----------------------------------------------------------------------------------------------------
		 
		 06 - Crie um método que recebe uma matriz de double e retorna o maior valor da matriz. 
		
		double[][] matriz06 = {
				{2.0, 4.3, 6.7},
				{3.1, 5.8, 7.6},
				{23.6, 13.7, 45.8},
				{56.4, 83.4, 0.2}
				};
		
		System.out.println("O maior valor da matriz é: "+ exercicio06(matriz06)); */
		
		
		/*----------------------------------------------------------------------------------------------------
		 
		 07 - Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos
			da matriz. 						
		
		int[][] matriz07 = {
				{2, 4, 6, 8},
				{20, 40, 60, 80},
				{200, 400, 600, 800},
				};
			
		System.out.println("A soma de todos os elementos da MAtriz é: "+ exercicio07(matriz07)); */
		
		
		/*----------------------------------------------------------------------------------------------------
		 
		 * 08 - Crie um método que recebe um array bidimensional de double e retorna a média dos valores deste array. 
	
		double[][] matriz08 = {
				{10.0, 20.0, 30.0},
				{100.2, 200.2, 300.2}
				};
		
		System.out.println("A média dos valores desta matriz é: "+ exercicio08(matriz08)); */
		
		
		/*----------------------------------------------------------------------------------------------------
		
		10 - Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional que
		contém apenas os elementos positivos desta matriz. */
		
		int[][] matriz10 = {
				{-10, -20, 30},
				{-50, -60, 110},
				{- 33, -17, 50},
				};
		
		int[] resultado10 = exercicio10(matriz10);
		System.out.print("Os elementos positivos da matriz são: {");
		
		for(int i = 0; i < resultado10.length; i++) {
			System.out.print( resultado10[i] + " ");
		}System.out.println("}");
		 
	}
	
	
	
	
	public static double[][] exercicio03(){
		
		double[][] matrizDouble = new double[2][5];
		
			for( int i = 0; i < matrizDouble.length; i++) {
				for( int j = 0; j < matrizDouble[i].length; j++) {
					matrizDouble[i][j] = Teclado.leDouble("Informe os valores da Matriz: ");
				}
			}
		return matrizDouble;
	
	}
	
	public static int exercicio04(double[][] matriz04){
		//int[][] recebeMatriz = matriz04;
		int qtdElementos = 0;
		
			for( int i = 0; i < matriz04.length; i++) {
				for( int j = 0; j < matriz04[i].length; j++) {
					qtdElementos++;
				}
			}
		
		return qtdElementos;
		
	}
	
	public static String exercicio05(double[][] matriz05) {
		String retornoMatriz ="";
		
		for( int i = 0; i < matriz05.length; i++) {
			for( int j = 0; j < matriz05[i].length; j++) {
				retornoMatriz += matriz05[i][j] + " - ";
				//if( retornoMatriz)
			}
			retornoMatriz += "\n"; //quebrando a linha ao final de cada array
			
		}
		
		return retornoMatriz;
	}
	
	public static double exercicio06(double[][] matriz06) {
		double maior = 0.0;
		
		for( int i = 0; i < matriz06.length; i++) {
			for( int j = 0; j < matriz06[i].length; j++) {
				if( matriz06[i][j] > maior) {
					maior = matriz06[i][j];
				}
			}
		}
		
		return maior;
		
	}

	public static int exercicio07(int[][] matriz07) {
		int soma = 0;
		
		for( int i = 0; i < matriz07.length; i++) {
			for( int j = 0; j < matriz07[i].length; j++) {
				soma += matriz07[i][j];
			}
		}
		
		return soma;
	}
	
	public static double exercicio08(double[][] matriz08) {
		int qntElementos = 0;
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < matriz08.length; i++) {
			for(int j = 0; j < matriz08[i].length; j++) {
				soma += matriz08[i][j]; 
				qntElementos++;
			}
		} media = soma / qntElementos;
		
		
		return media;
	}
	
	public static int[] exercicio10(int[][] matriz10) {
		
		//definindo o tamanho do array de positivos
		int tamanho = 0;
				
		for( int i = 0; i < matriz10.length; i++) {
			for( int j = 0; j < matriz10[i].length; j++) {
				if( matriz10[i][j] >= 0) {
					tamanho++;
					
				}
			}
		}
		
		//array com o tamanho definido
		int[] positivos = new int[tamanho];
		
		//preenchendo o array só de positivos
		int indice = 0;
		for( int i = 0; i < matriz10.length; i++) {
			for( int j = 0; j < matriz10[i].length; j++) {
				if( matriz10[i][j] >= 0) {
					positivos[indice] = matriz10[i][j];
					indice++;
				}
			}
		}
				
		
		return positivos;
	}
	
}
