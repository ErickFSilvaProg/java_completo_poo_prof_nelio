package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_while_02 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X, Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano.
		 * 
		 * Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será
		 * encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação
		 * sem escrever mensagem alguma).
		 */

		// Referências as bibliotecas:
		Scanner sc = new Scanner(System.in);

		// Variáveis:
		int entradaX, entradaY;

		// Programa:
		System.out.print("Coordenada X: ");
		entradaX = sc.nextInt();

		System.out.print("Coordenada Y: ");
		entradaY = sc.nextInt();

		while (entradaX != 0 && entradaY != 0) {

			if (entradaX > 0 && entradaY > 0) {

				System.out.println("Primeiro");
			} else if (entradaX < 0 && entradaY > 0) {

				System.out.println("Segundo");
			} else if (entradaX < 0 && entradaY < 0) {

				System.out.println("Terceiro");
			} else {

				System.out.println("Quarto");
			}

			System.out.println();
			System.out.print("Coordenada X: ");
			entradaX = sc.nextInt();

			System.out.print("Coordenada Y: ");
			entradaY = sc.nextInt();
		}

		if (entradaX == 0 || entradaY == 0) {

			System.out.println("");
		}

		// Fecha o Scanner:
		sc.close();

	}

}
