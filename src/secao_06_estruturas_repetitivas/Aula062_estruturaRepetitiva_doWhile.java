package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula062_estruturaRepetitiva_doWhile {
	
	/*
	 * → Estrutura repetitiva do-while:
	 * 
	 * 		O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
	 * 
	 * → Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
	 * 	 Perguntar se o usuário deseja repetir (s/n).
	 * 	 Caso o usuário figite "s", repetir o programa.
	 * 
	 * 		↪ Fórmula: F = (9*C/5) + 32
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis globais:
		char resp;
		
		
//		Programa:
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = scan.nextDouble();
			
			double F = (9*C/5) + 32;
			
			System.out.printf("Equivalente em Fehrenheit: %.1f%n%n", F);
			
			System.out.print("Deseja repetir: ");
			resp = scan.next().charAt(0);
		} while (resp != 'n');
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
