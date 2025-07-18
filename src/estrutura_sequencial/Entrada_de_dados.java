package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {
	
	public static void main(String[] args) {
		
		/*
		 * - Entrada de dados em Java:
		 * 
		 * Para fazer entrada de dados, criamos um objeto do tipo 'Scanner', da seguinte forma:
		 */
		
		
		// Seta o separador decimal para o ponto(.):
		Locale.setDefault(Locale.US);
		
		// Objeto Scanner:
		Scanner sc = new Scanner(System.in);
		
		
		// Variaveis:
		String varString;
		int varInt;
		double varDouble;
		char varChar;
		
		
		// Para ler uma palavra (texto sem espaços):
		varString = sc.next();
		System.out.println("Você digitou: " + varString);
		
		
		// Para ler um número inteiro:
		varInt = sc.nextInt();
		System.out.println("Você digitou: " + varInt);
		
		
		// Para ler um número com ponto flutuante: Ele pega o separador decimal do sistema operacional.
		varDouble = sc.nextDouble();
		System.out.println("Você digitou: " + varDouble);
		
		
		// Para ler 'um caractere':
		varChar = sc.next().charAt(0); // Pegará o primeiro caractere digitado.
		System.out.println(varChar);
		
		
		// Quando não mais precisar objeto 'Scanner', feche-o:
		sc.close();
		
	}

}
