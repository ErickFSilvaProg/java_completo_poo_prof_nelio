package exercicios.secao_06;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoFor_4 {
	
	/*
	 * Fazer um programa para ler um número N. 
	 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
	 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas iterações? ");
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.print("1º valor: ");
			double v1 = scan.nextInt();
			
			System.out.print("2º valor: ");
			double v2 = scan.nextInt();
			
			if (v2 == 0.0) {
				System.out.println("Divisão impossível.");
			}
			else {
				double divisao = v1 / v2;
				System.out.println("Valor da divisão: " + divisao);
			}
			
		}
		
		scan.close();
		
	}

}
