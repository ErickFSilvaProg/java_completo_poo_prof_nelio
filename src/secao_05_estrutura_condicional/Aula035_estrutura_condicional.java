package secao_05_estrutura_condicional;

import java.util.Scanner;

public class Aula035_estrutura_condicional {
	
	public static void main(String[] args) {
		
		/*
		 * - Estrutura Condicional:
		 * 
		 * É uma estrutura de controle que permite definir 
		 * que um certo bloco de comandos somente será executado 
		 * dependendo de uma condição.
		 * 
		 * - Regra da estrutura condicional simples: 
		 * 
		 * 		Se a regra for verdadeira, executa o bloco de comanos;
		 * 		Se a regra for falsa, não executa o bloco de comandos;
		 * 
		 * 
		 * - Regra da estrutura condicional composta:
		 * 
		 * 		Se a regra for verdadeira, execura somente o bloco 'if';
		 * 		Se a regra for falsa, executa somente o bloco 'else';
		 * 
		 * 
		 * Obs.: Se no bloco 'if' ou no bloco 'else' se eles contiverem 
		 * apenas um comando dentro deles as '{}' são opcionais.
		 * 
		 * 		
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int horas;
		
		
		System.out.println("Bom dia!");
		
		// Estrutura condicional: Simples.
		if (x < 0) {
			System.out.println("Boa tarde!");
		}
		
		System.out.println("Boa noite!");
		System.out.println();
		
		
		// Estrutura condicional: Composta.
		System.out.print("Quantas horas? ");
		horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		System.out.println();
		
		
		// Encadeamento de estrutura condicional: Composta.
		System.out.print("Que horas são: ");
		horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else {
			
			if (horas < 18) {
				System.out.println("Boa tarde!");
			}
			else {
				System.out.println("Boa noite!");
			}
			
		}
		System.out.println();
		
		
		System.out.print("Que horas são: ");
		horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else if (horas < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		
		// Fecha Scanner:
		sc.close();
		
	}

}
