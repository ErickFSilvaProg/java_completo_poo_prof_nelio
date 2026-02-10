package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula057_estruturaRepetitivaPara_for {
	
	/*
	 * → Estrutura repetitiva "para" (for):
	 * 
	 * 		É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
	 * 
	 * 		↪ Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
	 * 
	 * 
	 * 		↪ Exercício: Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números lidos
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		int repeticoes;
		int numero;
		int soma = 0;
		
		
//		Programa:
		System.out.print("Quantas repetições: ");
		repeticoes = scan.nextInt();
		scan.nextLine();
		
		for (int i = 1; i <= repeticoes; i++) {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			scan.nextLine();
			
			soma += numero;
		}
		
		System.out.println("Soma dos números = " + soma);
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
