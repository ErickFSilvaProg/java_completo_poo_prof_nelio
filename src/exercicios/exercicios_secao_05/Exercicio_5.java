package exercicios.exercicios_secao_05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * 		CODIGO		ESPECIFICAÇÃO			PREÇO
		 * 		1			Cachorro quente			R$ 4.00
		 * 		2			X-Salada				R$ 4.50
		 * 		3			X-Bacon					R$ 5.00
		 * 		4			Torradas simples		R$ 2.00
		 * 		5			Refrigerante			R$ 1.50
		 * 
		 */
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int codItem, qtdItem;
		double totalConta = 0;
		
		System.out.print("Código do item: ");
		codItem = sc.nextInt();
		
		System.out.print("Quantidade do item: ");
		qtdItem = sc.nextInt();
		
		if (codItem == 1) {
			
			totalConta = qtdItem * 4.00;
		}
		else if (codItem == 2) {
			
			totalConta = qtdItem * 4.50;
		}
		else if (codItem == 3) {
			
			totalConta = qtdItem * 5.00;
		}
		else if (codItem == 4) {
			
			totalConta = qtdItem * 2.00;
		}
		else if ( codItem == 5) {
			
			totalConta = qtdItem * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", totalConta);
		
		sc.close();
		
	}

}
