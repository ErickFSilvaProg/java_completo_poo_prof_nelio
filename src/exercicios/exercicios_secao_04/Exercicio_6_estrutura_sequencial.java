package exercicios.exercicios_secao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		/*
		 * - Exercício 6:
		 * 
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		 * 
		 * Em seguida, calcule e mostre:
		 * 
		 * 		a) a área do triângulo retângulo que tem A por base e C por altura.
		 * 		b) a área do círculo de raio C. (pi = 3.14159)
		 * 		c) a área do trapézio que tem A e B por bases e C por altura.
		 * 		d) a área do quadrado que tem lado B.
		 * 		e) a área do retângulo que tem lados A e B.
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		
		// Entrada de dados:
		System.out.print("Valor de A: ");
		A = sc.nextDouble();
		
		System.out.print("Valor de B: ");
		B = sc.nextDouble();
		
		System.out.print("Valor de C: ");
		C = sc.nextDouble();
		
		
		// Processamento de dados:
		triangulo = A * C / 2.0;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		
		// Saída do sistema:
		System.out.println();
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		// Fecha o Scanner:
		sc.close();
		
	}

}
