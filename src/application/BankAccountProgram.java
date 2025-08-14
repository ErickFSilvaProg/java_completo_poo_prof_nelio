package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankAccountProgram {
	
	public static void main(String[] args) {
		
//		Programa de Contas Bancárias
		
		// Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis:
		int number;
		double balance;
		String holder;
		
		
		// Programa:
		//                Insira o número da conta:
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		
		//                Insira o titular da conta:
		System.out.print("Enter account holder: ");
		sc.nextLine(); // Consumirá a quebra de linha do 'nextInt()'.
		holder = sc.nextLine();
		
		//                Há um depósito inicial (s/n)?
		System.out.print("It there an initial deposit (y/n)? ");
		
		
		// Fecha scanner:
		sc.close();
		
	}

}
