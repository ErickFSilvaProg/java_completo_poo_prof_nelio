package exercicios;

public class ExercicioAula025 {
	
	public static void main(String[] args) {
		
		// VARIÁVEIS:
		String product1 = "Computador"; // Produto
		String product2 = "Office desk"; // Produto
		
		int age = 30; // Idade
		int code = 5290; // Código
		char gender = 'F'; // Gênero
		
		double price1 = 2100.0; // Preço
		double price2 = 650.50; // Preço
		double measure = 53.234567; // Medida
		
		
		// '%.2f' delimita a duas casas decimais.
		// '%n' quebra de linha.
		// '%f' ponto flutuante.
		// '%d' inteiro.
		// '%s' string.
		
		
		// RESULTADOS:
		System.out.printf("Products: %n"
				+ "%s, which price is $ %.2f %n"
				+ "%s, which price is $ %.2f"
				, product1, price1, product2, price2);
		
		System.out.println("\n");
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		
		System.out.println("\n");
		System.out.printf("Measure with eight decimal place: %.8f %n"
				+ "Rouded (three decimal pleaces): %.3f %n"
				+ "US decimal point: %.3f"
				, measure, measure, measure);
		
	}

}
