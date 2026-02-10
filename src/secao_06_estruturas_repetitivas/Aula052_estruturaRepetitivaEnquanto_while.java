package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula052_estruturaRepetitivaEnquanto_while {
	
	/*
	 * → Estrutura repetitiva "enquanto" (while):
	 * 
	 * 		É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
	 * 		
	 * 		↪ Quando usar?
	 * 		
	 * 			Quando não se sabe previamente a quantidade de repetições que será realizada.
	 * 
	 * 
	 * 		↪ Exercício: Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		int numero;
		int total = 0;
		
		
//		Programa:
		System.out.print("Informe um número: ");
		numero = scan.nextInt();
		scan.nextLine();
		
		while (numero != 0) {
			total += numero;
			
			System.out.print("Informe um número: ");
			numero = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.println("Total dos números digitados: " + total);
		
		
//		Finalisa o Scanner.
		scan.close();
		
	}

}
