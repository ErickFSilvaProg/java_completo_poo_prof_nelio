package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula045_estrutura_while {

	public static void main(String[] args) {
		
		/*
		 * - While: é uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
		 * 
		 * Utiliza-se quando não se sabe previamente a quantidade de repetições que será realizada.
		 * 
		 */
		
		
		// Bibliotecas importadas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis:
		int numero;
		int soma = 0;
		
		
		// Exemplo 1: Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostrar a soma dos números lidos.
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		while (numero != 0) {
			
			soma += numero;
			
			System.out.print("Digite outro número: ");
			numero = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Soma dos números digitados = " + soma);
		
		
		// Fecha o Scanner:
		sc.close();

	}

}
