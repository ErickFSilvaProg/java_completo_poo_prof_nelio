package estrutura_sequencial;

import java.util.Locale;

public class SaidaDeDados {
	
	public static void main(String[] args) {
		
		// Considera o separador de decimal 'ponto' (.).
		Locale.setDefault(Locale.US);
		
		
		// Variáveis:
		int y = 32; // Inteiro
		double x = 10.35784; // Ponto flutuante
		String nome = "Erick";
		int idade = 38;
		double renda = 6546.45;
		
		
		// Sem quebra de linha ao final:
		System.out.print("Bom dia!");
		
		// Com quebra de linha ao final:
		System.out.println("Boa tarde!");
		System.out.println("Boa noite!");
		
		System.out.println(y);
		System.out.println(x);
		
		
		// '%.2f' delimita a duas casas decimais.
		// '%n' quebra de linha.
		// '%f' ponto flutuante.
		// '%d' inteiro.
		// '%s' string.
		
		
		// Imprimir controlando a quantidade de casas decimais:
		System.out.printf("%.2f %n", x);
		
		
		// Para concatenar vários elementos em um mesmo comando de escrita com 'print()' ou 'println()':
		System.out.println("RESULTADO = " + x + " METROS.");
		
		
		// Para concatenar vários elementos em um mesmo comando de escrita com 'printf()':
		System.out.printf("RESULTADO = %.2f METROS. %n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais. %n", nome, idade, renda);
		
	}

}
