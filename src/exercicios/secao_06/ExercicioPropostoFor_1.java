package exercicios.secao_06;

import java.util.Scanner;

public class ExercicioPropostoFor_1 {
	
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000).
	 * Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Biblioteca:
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		int X;
		int impar;
		
		
//		Programa:
		System.out.print("Informe um número: ");
		X = scan.nextInt();
		
		System.out.println();
		
		for (int i = 0; i <= X; i++) {
			
			if (i % 2 != 0) {
				impar = i;
				System.out.println(impar);
			}
			
		}
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
