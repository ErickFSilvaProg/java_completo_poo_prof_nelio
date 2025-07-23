package exercicios.Exercicios_sesao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		// - Exercício 1:
		
		// Variáveis
		Scanner sc = new Scanner(System.in);
		double area, largura, comprimento, preco, precoMetroQuadrado;
		
		
		// Programa
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.println();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.println();
		
		System.out.print("Digite o valor do metro quadrado: ");
		precoMetroQuadrado = sc.nextDouble();
		System.out.println();
		
		area = largura * comprimento;
		preco = area * precoMetroQuadrado;
		
		System.out.printf("Área = %.2f %n", area);
		System.out.printf("Preço = %.2f %n", preco);
		
		
		// Fecha o objeto Scanner.
		sc.close();
		
	}

}
