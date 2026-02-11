package exercicios.secao_06;

import java.util.Scanner;

public class ExercicioPropostoWhile_2 {
	
	/*
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
	 * 
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
	 * Para cada ponto escrever o quadrante a que ele pertence. 
	 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
	 * 
	 */

	public static void main(String[] args) {
		
//		Bibliotecas:
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		int X, Y;
		
		
//		Programa:
		System.out.print("Informe a coordenada de X: ");
		X = scan.nextInt();
		
		System.out.print("Informe a coordenada de Y: ");
		Y = scan.nextInt();
		
		while (X != 0 && Y != 0) {
			
			if (X > 0 && Y > 0) {
				System.out.println("\nPrimeiro\n");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("\nSegundo\n");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("\nTerceiro\n");
			}
			else {
				System.out.println("\nQuarto\n");
			}
			
			System.out.print("Informe a coordenada de X: ");
			X = scan.nextInt();
			
			System.out.print("Informe a coordenada de Y: ");
			Y = scan.nextInt();
			
		}
		
		
//		Fecha o scanner:
		scan.close();

	}

}
