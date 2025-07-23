package estrutura_condicional;

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
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int hora;
		
		
		System.out.println("Bom dia!");
		
		// Estrutura condicional: Simples.
		if (x < 0) {
			System.out.println("Boa tarde!");
		}
		
		System.out.println("Boa noite!");
		
		
		// Estrutura condicional: Composta.
		System.out.print("Quantas horas? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		
		
		// Fecha Scanner:
		sc.close();
		
	}

}
