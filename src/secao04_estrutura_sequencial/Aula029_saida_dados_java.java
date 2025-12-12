package secao04_estrutura_sequencial;

import java.util.Locale;

public class Aula029_saida_dados_java {
	
	/**
	 * - Para escrever  na tela um texto qualquer:
	 * 
	 * 		-- Sem quebra de linha ao final.
	 * 		System.out.print("");
	 * 
	 * 
	 *  	-- Com quebra de linha ao final.
	 *  	System.out.println(""); 
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		int var_int = 32;
		String nome = "Erick";
		int idade = 39;
		double renda = 6745.34;
		
		
//		Saída de dados: Com e sem quebra de linha.
		System.out.print("Olá, mundo!"); // Não será adicionado uma quebra de linha.
		System.out.println("Bom dia!"); // Será adicionado uma quebra de linha.
		System.out.println("JAVA");
		
		
//		Para escrever o conteúdo de uma variável do tipo inteiro:
		
		System.out.println(var_int);
		
		
//		Para escrever o conteúdo de uma variável com ponto flutuante:
		// %n -> Quebra de linha (independente de plataforma).
		// %f -> Ponto flutuante.
		// %s -> Texto.
		// %d -> Inteiro.

		double var_double = 10.35784;
		System.out.println(var_double);
		
		System.out.printf("%.1f%n", var_double); // Formata com uma casa decimal.
		System.out.printf("%.2f%n", var_double); // Formata com duas casas decimais.
		
		// Para considerar o separador de decimais 'ponto', no 'printf', insira o comando:
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.3f%n", var_double); // Formata com três casas decimais.
		System.out.printf("%.4f%n", var_double); // Formata com quatro casas decimais.
		
		
//		Para concatenar vários elementos em um mesmo comando de escrita: print, println, printf.
		
		System.out.print("Resultado = " + var_double + " metros.");
		System.out.println("Resultado = " + var_double + " metros.");
		System.out.printf("Resultado = " + "%.1f" + " metros.%n", var_double);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}

}
