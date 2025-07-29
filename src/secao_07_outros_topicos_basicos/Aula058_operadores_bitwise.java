package secao_07_outros_topicos_basicos;

import java.util.Scanner;

public class Aula058_operadores_bitwise {

	public static void main(String[] args) {

		/*
		 * Operadores 'bitwise': são operadores que realizam operações lógicas bit a bit
		 * em valores.
		 * 
		 * & -> Operação 'E' bit a bit.
		 * 
		 * Retorna verdadeiro somente quando 'ambas as operações' são verdadeiras.
		 * 
		 * 
		 * | -> Operação 'OU' bit a bit
		 * 
		 * Retorna verdadeiro quando 'pelo menos uma' operação é verdadeira.
		 * 
		 * 
		 * ^ -> Operação 'OU-exclusivo' bit a bit
		 * 
		 * Retorna verdadeiro quando 'apenas uma' for verdadeira.
		 */

		// Operações bit a bit:
		System.out.println(89 & 60);
		System.out.println(89 | 60);
		System.out.println(89 ^ 60);
		System.out.println();

		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 0b00100000; // 32 no formato binário.

		// Programa:
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} 
		else {
			System.out.println("6th bit is false!");
		}

		// Fecha o Scanner
		sc.close();

	}

}
