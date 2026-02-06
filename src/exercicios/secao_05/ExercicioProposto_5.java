package exercicios.secao_05;

import java.util.Scanner;

public class ExercicioProposto_5 {
	
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
		
		Scanner sc = new Scanner(System.in);
		
		int codItem, qtdItem;
		double vlrTotal;
		
		
		System.out.print("Cód. do item: ");
		codItem = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Qtd. do item: ");
		qtdItem = sc.nextInt();
		sc.nextLine();
		
		
		if (codItem == 1) {
			vlrTotal = 4.00 * qtdItem;
			System.out.println("\nValor a pagar = R$ " + vlrTotal);
		}
		
		
		sc.close();
		
	}

}
