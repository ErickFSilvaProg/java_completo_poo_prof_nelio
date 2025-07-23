package exercicios.Exercicios_sesao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		 * - Exercício 3:
		 * 
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
		 * DIFERENCA = (A * B - C * D).
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, DIFERENCA;
		
		
		// Leitura dos dados
		System.out.print("Valor de 'A': ");
		A = sc.nextInt();
		System.out.println();
		
		System.out.print("Valor de 'B': ");
		B = sc.nextInt();
		System.out.println();
		
		System.out.print("Valor de 'C': ");
		C = sc.nextInt();
		System.out.println();
		
		System.out.print("Valor de 'D': ");
		D = sc.nextInt();
		System.out.println();
		
		DIFERENCA = (A * B) - (C * D);
		
		System.out.println("DIFERENÇA = " + DIFERENCA);
		
		
		// Fecha o Scanner
		sc.close();
		
	}

}
