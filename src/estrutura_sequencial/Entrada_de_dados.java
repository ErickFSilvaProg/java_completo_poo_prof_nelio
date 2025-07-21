package estrutura_sequencial;

// Importando bibliotecas do java:
import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {
	
	public static void main(String[] args) {
		
		/*
		 * - Entrada de dados em Java:
		 * 
		 * Para fazer entrada de dados, criamos um objeto do tipo 'Scanner', da seguinte forma:
		 */
		
		
		// Objeto Locale:
		Locale.setDefault(Locale.US);
		
		// Objeto Scanner:
		Scanner sc = new Scanner(System.in);
		
		
		// Variaveis:
		String varString;
		int varInt;
		double varDouble;
		char varChar;
		
		
		// Para ler uma palavra (texto sem espaços):
		System.out.print("Digite uma palavra: ");
		varString = sc.next();
		
		System.out.println("Você digitou: " + varString);
		
		
		// Para ler um número inteiro:
		System.out.print("\nDigite um número: ");
		varInt = sc.nextInt();
		
		System.out.println("Você digitou: " + varInt);
		
		
		// Para ler um número com ponto flutuante: Ele pega o separador decimal do sistema operacional.
		System.out.print("\nDigite um númeto fracionado: ");
		varDouble = sc.nextDouble();
		
		System.out.println("Você digitou: " + varDouble);
		
		
		// Para ler 'um caractere':
		System.out.print("\nDigite uma letra ou palavra: ");
		varChar = sc.next().charAt(0); // Pegará o primeiro caractere digitado ou da palavra digitada.
		
		System.out.println(varChar);
		
		
		// Para ler vários dados na mesma linha:
		System.out.print("\nDigite uma palavra: ");
		varString = sc.next();
		
		System.out.print("\nDigite um número: ");
		varInt = sc.nextInt();
		
		System.out.print("\nDigite um número fracionado: ");
		varDouble = sc.nextDouble();
		
		System.out.println("\n- Dados digitados:");
		System.out.println("Nome: " + varString);
		System.out.println("Idade: " + varInt);
		System.out.println("Salário: " + varDouble);
		
		
		// Quando não mais precisar objeto 'Scanner', feche-o:
		sc.close();
		
	}

}
