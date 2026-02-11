package exercicios.secao_05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoIF_7 {
	
	/*
	 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
	 * de um ponto em um plano. 
	 * 
	 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um 
	 * dos eixos cartesianos ou na origem (x = y = 0).
	 * 
	 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
	 * 
	 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		double valorX, valorY;
		
		
//		Entrada do programa:
		System.out.print("Valor de X: ");
		valorX = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("Valor de Y: ");
		valorY = scan.nextDouble();
		scan.nextLine();
		
		
//		Programa:
		if (valorX == 0.0 && valorY == 0.0) {
			System.out.println("\nOrigem");
		}
		else if (valorX == 0.0) {
			System.out.println("\nEixo Y");
		}
		else if (valorY == 0.0) {
			System.out.println("\nEixo X");
		}
		else if (valorX > 0.0 && valorY > 0.0) {
			System.out.println("\nQ1");
		}
		else if (valorX < 0.0 && valorY > 0.0) {
			System.out.println("\nQ2");
		}
		else if (valorX < 0.0 && valorY < 0.0) {
			System.out.println("\nQ3");
		}
		else {
			System.out.println("\nQ4");
		}
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
