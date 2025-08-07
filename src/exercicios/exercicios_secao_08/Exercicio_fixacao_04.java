package exercicios.exercicios_secao_08;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Exercicio_fixacao_04 {
	
	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler a cotação do dolar, e depois um valor em dólares 
		 * a ser comparado por uma pessoa em reais. 
		 * 
		 * Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
		 * 
		 * Crie uma classe 'CurrencyConverter' para ser responsável pelos cálculos.
		 */
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Variáveis:
		double dollarPrice; // Preço do dólar.
		double result; // Resultado.
		double amount; // Quantia.
		
//		Programa:
		// Qual é o valor do dólar?
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		// Quantos dólares serão comprados?
		System.out.print("How many dollars will be bought? ");
		amount = sc.nextDouble();
		
		result = CurrencyConverter.dollarReal(amount, dollarPrice);
		//                 Valor a ser pago em reais
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
//		Fecha Scanner:
		sc.close();
		
	}

}
