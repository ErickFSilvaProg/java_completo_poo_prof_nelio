package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_07 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro positivo N.
		 * 
		 * O programa deve então mostrar na tela N linhas, começando de 1 até N.
		 * 
		 * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do
		 * valor, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		int total;

		System.out.print("Digite um número: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print(i + " ");

			for (int x = 2; x <= 3; x++) {

				total = (int) Math.pow(i, x);
				System.out.print(total + " ");
			}

			System.out.println();
		}

		sc.close();

	}

}
