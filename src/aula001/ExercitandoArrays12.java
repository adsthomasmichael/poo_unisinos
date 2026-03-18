package aula001;

import com.utils.Teclado;

public class ExercitandoArrays12 {

	public static void main(String[] args) {
		
		/* Exercicio 12a 
		
		int[][] m = {
				{10, 20},
				{100, 200},
				{1, 2}
		};
		
		imprimeArray(m); */
		
				
		/* -----------------------------------------------------------------------------------
		 
		 * 	Exercicio 12e - retorna um array unidimensional com todos os valores
			que são pares, ou o array vazio caso não haja valores pares 
		
		 int[][] m = {
				{1, 3, 12},
				{13, 16, 19},
				{0, 20, 23},
				{24, 27, 29},
				};
		
		int[] retornoE = encontraPares(m);
		System.out.println("Os numeros pares desta Matriz são: ");
		
			for(int i = 0; i < retornoE.length; i++) {
				System.out.println(retornoE[i]);
			} */
		
		/* -----------------------------------------------------------------------------------
			 
			 * 	Exercicio 12f - retorna um array unidimensional com todos os valores
				que são primos, ou o array vazio caso não haja valores primos. */
			
		int[][] m = {
				{3, 4, 5, 7, 8, 9, 10},
				{11, 13, 14, 15, 17, 18, 19},
				{20, 23, 24, 25, 26, 27, 28},
				};
		
		System.out.println("Os numeros PRIMOS na Matriz são: ");
		
		int[] retornoPrimos = encontraPrimos(m);
		
			for(int i = 0; i < retornoPrimos.length; i++) {
				System.out.println(retornoPrimos[i]+ " ");
			}
		
			
	}
	
	public static void imprimeArray(int[][] m) {
		
		for( int i = 0; i < m.length; i++) {
			for( int j = 0; j < m[i].length; j++) {
				System.out.print( m[i][j] + " ");
			}System.out.println(" ");
		}
		
		
	}
	
	public static int[] encontraPares(int[][] m) {
		//definindo o tamanho do array
		int tamanho = 0;
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] % 2 == 0) {
					tamanho++;
				}
			}
		}
		
		//preenchendo array de pares
		int indice = 0;
		int[] pares = new int[tamanho];
		
		for(int i = 0; i < m.length; i++) {
			for( int j = 0; j < m[i].length; j++) {
				if(m[i][j] % 2 == 0) {
				pares[indice] = m[i][j];
				indice++;
				}
			}
			
		}
	
		return pares;
	
	}
	
	public static int[] encontraPrimos(int[][] m) {
		//determinando o tamanho do array
		int tamanho = 0;
		int primoN = 0;
		
			for( int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if( m[i][j] < 1 || 
						( m[i][j] % 1 != 0) &&
							(m[i][j] % m[i][j] != 0)) {
						primoN++; 
					} else {
						tamanho++;
					} 
				}
			}
		
		//declarando array de primos com o tamanho definido
		int[] ehprimo = new int[tamanho];
		
			//preenchendo array de primos
		int indice = 0;
			for( int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[j].length; j++) {
					if( m[i][j] < 1 || 
							( m[i][j] % 1 != 0) &&
								(m[i][j] % m[i][j] != 0)) {
							 
						} else {
							ehprimo[indice] = m[i][j];
						} 
				}
			}
			
			
		
		
		
		return ehprimo;
	}

}
