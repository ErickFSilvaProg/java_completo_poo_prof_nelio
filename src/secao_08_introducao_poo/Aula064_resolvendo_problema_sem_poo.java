package secao_08_introducao_poo;

import java.util.Locale;
import java.util.Scanner;

public class Aula064_resolvendo_problema_sem_poo {
	
	public static void main(String[] args) {
		
		/*
		 * Resolvendo problema sem Orientação a Objetos.
		 * 
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
		 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
		 * 
		 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte:
		 * 
		 * 		p = (a + b + c) / 2.0
		 * 		Math.sqrt(p * (p - a) * (p - b) * (p - c))
		 */
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		
		
//		Variáveis:
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		double p, areaX, areaY;
		
		
//		Programa:
		System.out.println("Enter the measure of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measure of triangule Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// Cacular a área do triângulo X:
		p = (xA + xB + xC) / 2.0;
		areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		// Calcular a área do triângulo Y:
		p = (yA + yB + yC) / 2.0;
		areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		// Imprimi a área dos triângulos:
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		
//		Fecha o Scanner:
		sc.close();
		
	}

}
