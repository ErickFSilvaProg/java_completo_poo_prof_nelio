package exercicios.exercicios_secao_06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_for_03 {
	
	public static void main(String[] args) {
		
		// Loclização padrão:
		Locale.setDefault(Locale.US);
		
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
		 * 
		 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
		 * 
		 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
		 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e 
		 * o terceiro valor tem peso 5.
		 */
		
		
//		Variáveis:
		Scanner scanner = new Scanner(System.in);
		int n;
		
//		Programa:
		System.out.print("Quantidade de testes: ");
		n = scanner.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
				
				System.out.println(i + "ª sequência: ");
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				double c = scanner.nextDouble();
				
				double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
				
				System.out.printf("Média: %.1f%n", media);
				System.out.println();
				
		}
		
//		Fecha Scanner:
		scanner.close();
		
	}

}
