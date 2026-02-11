package exercicios.secao_05;

import java.util.Scanner;

public class ExercicioPropostoIF_1 {
	
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroInteiro;
		
		System.out.print("Digite um número inteiro: ");
		numeroInteiro = sc.nextInt();
		sc.nextLine();
		
		if (numeroInteiro < 0) {
			System.out.println("Número negativo");
		}
		else {
			System.out.println("Número positivo.");
		}
		
		sc.close();
		
	}

}
