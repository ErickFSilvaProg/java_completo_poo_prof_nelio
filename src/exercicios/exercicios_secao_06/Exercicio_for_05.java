package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_05 {
	
	public static void main(String[] args) {
		
		/*
		 * Ler um valor N. 
		 * Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.
		 */
		
		
//		Variáveis:
		Scanner sc = new Scanner(System.in);
		int n;
		int fat = 1;
		
		
//		Programa:
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			fat = fat * i;
			
		}
		
		System.out.printf("Fatorial de %d é %d", n, fat);
		
		
//		Fecha o Scanner;
		sc.close();
		
	}

}
