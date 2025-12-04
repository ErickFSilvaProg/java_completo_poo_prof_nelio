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
		
		
		// Variables: Variáveis.
		BankAccount account; // Conta
		int number; // Número
		double balance; // Saldo
		double initialDeposit; // Depósito inicial
		double depositValue; // Valor do depósito
		double withdrawValue; // Valor de retirada
		String holder; // Titular
		char response; // Resposta
		
		
		// Data entry: Entrada de dados.
		//                Insira o número da conta:
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		
		//                Insira o titular da conta:
		System.out.print("Enter account holder: ");
		sc.nextLine(); // Consumirá a quebra de linha do 'nextInt()'.
		holder = sc.nextLine();
		
		//                Há um depósito inicial (s/n)?
		System.out.print("It there an initial deposit (y/n)? ");
		response = sc.next().charAt(0);
		
		if (response == 'y') {
			//                Insira o valor do depósito inicial:
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		}
		else {
			account = new BankAccount(number, holder);
		}
		
		
		// Account data: Dados da conta.
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		
		// Enter a deposity value: Insira um valor de depósito.
		System.out.println();
		System.out.print("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		
		// Updated account data: Dados da conta atualizados.
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		// Enter a withdraw value: Insira um valor de retirada
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		
		// Updated account data: Dados da conta atualizados.
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		// Fecha scanner:
		sc.close();
		
	}

}
