package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula055_estrutura_do_while {
	
	public static void main(String[] args) {
		
		/*
		 * - do/while: O bloco de comandos executa pelo menos uma vez, 
		 * pois a condição é verificada no funal.
		 * 
		 * 
		 * Exercício: Fazer um programa para ler uma temperatura em Celsius 
		 * e mostrar o equivalente em Fahrenheit. 
		 * 
		 * Perguntar se o usuário deseja repetir (s/n). 
		 * Caso o usuário digite "s", repetir o programa.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.print("Deseja repetir [s/n]? ");
			resp = sc.next().charAt(0);
			System.out.println();
		}
		while (resp != 'n');
		
		System.out.println("Programa finalisado!");
		
		sc.close();
		
	}

}
