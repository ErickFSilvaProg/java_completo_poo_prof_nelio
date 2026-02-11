package exercicios.secao_05;

import java.util.Scanner;

public class ExercicioPropostoIF_3 {
	
	/*
	 * Leia 2 valores inteiros (A e B).
	 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
	 * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		
		System.out.print("Primeiro número: ");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		sc.nextLine();
		
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São multiplos.");
		}
		else {
			System.out.println("Não são multiplos.");
		}
		
		
		sc.close();
		
	}

}
