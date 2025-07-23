package exercicios.Exercicios_sesao_05;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			
			System.out.println("NEGATIVO");
		}
		else {
			
			System.out.println("NÃO NEGATIVO");
		}
		
		// Fecha o Scanner
		sc.close();
		
	}

}
