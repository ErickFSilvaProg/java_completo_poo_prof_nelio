package exercicios.secao_05;

import java.util.Scanner;

public class ExercicioProposto_2 {
	
	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um número: ");
		numero = sc.nextInt();
		sc.nextLine();
		
		if (numero % 2 == 0) {
			System.out.println("O número é PAR.");
		}
		else {
			System.out.println("O número é IMPAR.");
		}
		
		sc.close();
		
	}

}
