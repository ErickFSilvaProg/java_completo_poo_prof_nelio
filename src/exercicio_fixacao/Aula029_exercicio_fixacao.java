package exercicio_fixacao;

import java.util.Locale;

public class Aula029_exercicio_fixacao {
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		String product1 = "Computador";
		String product2 = "Office desk";
		char gender = 'F';
		
		int age = 30;
		int code = 5290;
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
//		Programa:
		
		System.out.println("- Products:\n");
		System.out.printf("Computer, which price is $ %.2f%n", price1);
		System.out.printf("Office desk, which price is $ %.2f%n%n", price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}

}
