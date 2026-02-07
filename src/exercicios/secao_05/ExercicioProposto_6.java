package exercicios.secao_05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto_6 {
	
	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
	 * em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
	 * 
	 * Obviamente se o valor não estiver em nenhum destes intervalos, 
	 * deverá ser impressa a mensagem “Fora do intervalo”.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
//		Variáveis:
		double valor = 0.0;
		
		
//		Programa:
		System.out.print("Informe um valor: ");
		valor = entrada.nextDouble();
		entrada.nextLine();
		
		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora do intervalo!");
		}
		else if (valor <= 25.0) {
			System.out.println("Intervalo [0 ↔ 25]");
		}
		else if (valor <= 50.0) {
			System.out.println("Intervalo [25 ↔ 50]");
		}
		else if (valor <= 75.0) {
			System.out.println("Intervalo [50 ↔ 75]");
		}
		else {
			System.out.println("Intervalo [75 ↔ 100]");
		}
		
		
//		Fecha o Scanner:
		entrada.close();
		
	}

}
