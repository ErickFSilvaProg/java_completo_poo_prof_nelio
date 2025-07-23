package exercicios.Exercicios_sesao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		 * - Exercício 2:
		 * 
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
		 */
		
		// Variáveis
		Scanner sc = new Scanner(System.in);
		double area, raio, pi = 3.14159;
		
		// Entrada de dados
		System.out.print("Qual o valor do raio: ");
		raio = sc.nextDouble();
		System.out.println();
		
		// Processamento
		area = pi * (Math.pow(raio, 2));
		
		// Saída de dados
		System.out.printf("Saída: %.4f", area);
		
		// Fecha o Scanner
		sc.close();
		
	}

}
