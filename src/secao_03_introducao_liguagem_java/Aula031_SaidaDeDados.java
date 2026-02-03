package secao_03_introducao_liguagem_java;

import java.util.Locale;

public class Aula031_SaidaDeDados {
	
	public static void main(String[] args) {
		
		System.out.print("Olá, mundo!");
		System.out.println("Bom dia!");
		
		
		// Variáveis:
		int y = 32;
		double x = 10.35784;
		String nome = "Erick";
		int idade = 39;
		double renda = 5645.34;
		
		
		/*
		 * Para escrever o conteúdo de uma variável de algum tipo básico:
		 * 
		 */
		
		System.out.println(y);
		
		
		/*
		 * Para escrever o conteúdo de uma variável com ponto flutuante:
		 * 
		 * %n - Quebra de linha (independente de plataforma)
		 * 
		 * Para considerar o separador de decimais como ponto, antes da declaração do Scanner, faça:
		 * 
		 * 		Locale.setDefault(Locale.US);
		 * 
		 */
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita:
		 * 
		 */
		
		System.out.println("Resultado: " + x + " metros.");
		
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita:
		 * 
		 * %n - Quebra de linha
		 * %f - Ponto flutuante
		 * 
		 */
		
		System.out.printf("Resultado: %.2f metros.%n", x);
		
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita:
		 * 
		 * %n - Quebra de linha
		 * %f - Ponto flutuante
		 * %d - Inteiro
		 * %s - Texto
		 * 
		 */
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}

}
