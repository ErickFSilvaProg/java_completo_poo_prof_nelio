package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class Aula050_estrutura_for {

	public static void main(String[] args) {

		/*
		 * - for: É uma estrutura de controle que repete um bloco de comandos para um
		 * certo intervalo de valores.
		 * 
		 * Utilisada quando se sabe preciamente a quantidade de repetições, ou o
		 * intervalo de valores.
		 * 
		 */

//		Exercício: Fazer um programa que lê um valor inteiro N e depois N números inteiros.
//		Ao final, mostrar a soma dos N números lidos.
		
		
//		Variáveis:
		Scanner sc = new Scanner(System.in);
		int N;
		int x = 0;
		int soma = 0;
		
//		Programa:
		System.out.print("Digite um intervalo: ");
		N = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			
			if (x == 0) {
				
				System.out.print("Digite um número: ");
				x = sc.nextInt();
			}
			else {
				
				System.out.print("Digite outro número: ");
				x = sc.nextInt();
			}
			
			soma += x;
		}
		
		System.out.println("Soma dos números: " + soma);
		System.out.println();
		
		
//		A estrutura 'for' é ótima para se fazer uma repetição baseada em uma 'contagem'.
		for (int i = 4; i > 0; i--) {
			
			System.out.print((i > 1) ? i + ", " : i + "...");
		}
		
		sc.close();

	}

}
