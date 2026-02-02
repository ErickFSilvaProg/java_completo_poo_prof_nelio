package secao_03_introducao_liguagem_java;

public class Aula028_ExpressoesAritmeticas {
	
	public static void main(String[] args) {
		
		/**
		 * - Expressões aritméticas:
		 * 
		 * 		+	Adição
		 * 		-	Subtração
		 * 		*	Multiplicação
		 * 		/	Divisão
		 * 		%	Resto da divisão ("mod")
		 * 
		 * 
		 * - Precedência:
		 * 
		 * 		1º lugar: * / %
		 * 		2º lugar: + -
		 */
		
		
		// Exemplos:
		
		System.out.println("Resultado: " + 2*6/3);
		System.out.println("Resultado: " + 3+2*4);
		System.out.println("Resultado: " + (3+2)*4);
		System.out.println("Resultado: " + 60/(3+2)*4);
		System.out.println("Resultado: " + 60/((3+2)*4));
		System.out.println("Resultado: " + 14%3);
		System.out.println("Resultado: " + 19%5);
		
	}

}
