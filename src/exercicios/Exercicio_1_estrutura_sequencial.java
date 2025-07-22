package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		 * - Exercício 2:
		 * 
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		
		// Variáveis
		Scanner sc = new Scanner(System.in);
		double valor1, valor2, totalValores;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextDouble();
		System.out.println();
		
		totalValores = valor1 + valor2;
		
		System.out.println("Soma = " + totalValores);
		
		// Fecha o Scanner
		sc.close();
		
	}

}
