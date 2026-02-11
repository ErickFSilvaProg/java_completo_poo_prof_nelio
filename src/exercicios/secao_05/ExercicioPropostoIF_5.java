package exercicios.secao_05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoIF_5 {
	
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
	 * A seguir, calcule e mostre o valor da conta a pagar.
	 * 
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
	 * 
	 * 
	 * 		cod:	Especificação:		Preço:
	 * 		1		Cachorro quente		R$ 4,00
	 * 		2		X-Salada			R$ 4,50
	 * 		3		X-Bacon				R$ 5,00
	 * 		4		Torrada simples		R$ 2,00
	 * 		5		Refrigerante		R$ 1,50
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codItem, qtdItem;
		double vlrTotal = 0.00;
		boolean pedidoValido = false;
		
		
		System.out.print("Cód. do item: ");
		codItem = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Qtd. do item: ");
		qtdItem = sc.nextInt();
		sc.nextLine();
		
		
		if (codItem == 1) {
			vlrTotal = 4.00 * qtdItem;
			pedidoValido = true;
		}
		else if (codItem == 2) {
			vlrTotal = 4.50 * qtdItem;
			pedidoValido = true;
		}
		else if (codItem == 3) {
			vlrTotal = 5.00 * qtdItem;
			pedidoValido = true;
		}
		else if (codItem == 4) {
			vlrTotal = 2.00 * qtdItem;
			pedidoValido = true;
		}
		else if (codItem == 5) {
			vlrTotal = 1.50 * qtdItem;
			pedidoValido = true;
		}
		
		if (pedidoValido == false) {
			System.out.println("\nItem não encontrado!");
		}
		else {
			System.out.printf("\nValor a pagar = R$ %.2f", vlrTotal);
		}
		
		
		sc.close();
		
	}

}
