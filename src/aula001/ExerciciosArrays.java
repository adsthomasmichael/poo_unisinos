package aula001;

import java.util.Scanner;

public class ExerciciosArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 1a - Crie uma classe chamada ExerciciosArrays. Nela, crie os seguintes métodos:
			a) Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo:
			0 1 2 3 4 5 6 7 8 9
			0 1 2 3 4 5 6 7 8 9
			0 1 2 3 4 5 6 7 8 9 
		
		int[][] resultado = exercicio1a();
		
		for( int i = 0; i < resultado.length; i++) {
			for( int j = 0; j < resultado[i].length; j++) {
				System.out.print( resultado[i][j]+ " ");
			}
			System.out.println();
		
		
		} */
		
		
		/* ---------------------------------------------------------------------------------------
		 1b - Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo:
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81 
		
		int[][] resultadoB = exercicio1b();
		
		for( int i = 0; i < resultadoB.length; i++) {
			for( int j = 0; j < resultadoB[i].length; j++) {
				System.out.print(resultadoB[i][j]+ " ");
			}
			System.out.println();
	
		
		} */
		
		
		/*----------------------------------------------------------------------------------------
		1c - Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo:
			0 0 0 0 0 0
			1 1 1 1 1 1
			2 2 2 2 2 2
			3 3 3 3 3 3
			4 4 4 4 4 4
			5 5 5 5 5 5		
		
		int[][] resultadoC = exercicio1c();
		
			for( int i = 0; i < resultadoC.length; i++) {
				for( int j = 0; j < resultadoC[i].length; j++) {
					System.out.print(resultadoC[i][j]+ " ");
				}System.out.println();
			} */
			
			
		/*------------------------------------------------------------------------------------------
		1d - Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
			-1 -1 -1 -1 -1 -1
			 0 0 0 0 0 0
			-1 -1 -1 -1 -1 -1
			 0 0 0 0 0 0
			-1 -1 -1 -1 -1 -1
			 0 0 0 0 0 0
			-1 -1 -1 -1 -1 -1
			 0 0 0 0 0 0
			-1 -1 -1 -1 -1 -1 */
	
		int[][] resultadoD = exercicio1d();
			for( int i = 0; i < resultadoD.length; i++) {
				for( int j = 0; j < resultadoD[i].length; j++) {
					System.out.print(resultadoD[i][j]+ " ");
				}System.out.println();	
			}
			
			
			
			
	
	}
	
	public static int[][] exercicio1a(){
		
		int[][] matriz = new int[3][10];
			
			for( int i  = 0; i < matriz.length; i++) {
				for( int j = 0; j < matriz[i].length; j++) {
					matriz [i][j] = j;
					
				}
			}
		
		return matriz;
	
		
	}
	
	public static int [][] exercicio1b(){
		
		int[][] matrizB = new int[5][10];
		
			for( int i = 0; i < matrizB.length; i++) {
				for( int j = 0; j < matrizB[i].length; j++) {
					matrizB[i][j] = j*j;
				}
			} 
	
	return matrizB;
	
	}
	
	public static int[][] exercicio1c(){
		
		int[][] matrizC = new int[6][6];
		
			for( int i = 0; i < matrizC.length; i++) {
				for( int j = 0; j < matrizC[i].length; j++) {
					matrizC[i][j] = i; 
				}
			}
		
		return matrizC;
		
	}
	
	public static int[][] exercicio1d(){
		
		int[][] matrizD = new int[9][6];
		
			for( int i = 0; i < matrizD.length; i++) {
				for( int j = 0; j < matrizD[i].length; j++) {
					if ( i % 2 == 0) {
						matrizD[i][j] = -1;
					} else {
						matrizD[i][j] = 0;
					}
				}
			}
			
		return matrizD;
	}

	
	
	
}
