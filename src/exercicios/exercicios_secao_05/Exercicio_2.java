package exercicios.exercicios_secao_05;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}

}
