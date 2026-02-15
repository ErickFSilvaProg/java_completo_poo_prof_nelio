package exercicios.secao_06;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoFor_3 {
	
	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
	 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
	 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
	 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Biblioteca:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis globais:
		int qtdTestes;
		
		
//		Programa:
		System.out.print("Quantidade de testes: ");
		qtdTestes = scan.nextInt();
		scan.nextLine();
		
		for (int i = 1; i <= qtdTestes; i++) {
			
			System.out.println(" → " + i + "º caso:");
				
				System.out.print("	↪ 1º valor: ");
				double priValor = scan.nextDouble();
				scan.nextLine();
				
				System.out.print("	↪ 2º valor: ");
				double segValor = scan.nextDouble();
				scan.nextLine();
				
				System.out.print("	↪ 3º valor: ");
				double terValor = scan.nextDouble();
				scan.nextLine();
				
				double media = (priValor*2.0 + segValor*3.0 + terValor*5.0) /10.0;
				System.out.printf("%nMédia do %dº caso: %.1f%n%n", i, media);
			
		}
		
		
//		Fecha Scanner:
		scan.close();
		
	}

}
