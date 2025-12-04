package secao_08_introducao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Aula066_metodo_para_reaproveitamento_delegacao {
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		
//		Variáveis:
		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		double areaX, areaY;
		
//		Programa:
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area Y");
		}
		
//		Fecha o Scanner:
		sc.close();
		
	}

}
