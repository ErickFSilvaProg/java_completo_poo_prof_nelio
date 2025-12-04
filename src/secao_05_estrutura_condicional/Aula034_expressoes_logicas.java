package secao_05_estrutura_condicional;

public class Aula034_expressoes_logicas {
	
	public static void main(String[] args) {
		
		/*
		 * - Expressões lógicas:
		 * 
		 * 		&& - E
		 * 		|| - OU
		 * 		!  - NÃO
		 * 
		 * No 'operador &&' todas as condições devem ser verdadeiras.
		 * No 'operador ||' pelo menos uma condição deve ser verdadeira.
		 * No 'operador !' a condição é invertida.
		 */
		
		
		// Variáveis:
		int X = 5;
		
		
		// Operador &&
		System.out.println(X <= 20 && X == 10);
		System.out.println(X > 0 && X != 3);
		System.out.println(X <= 20 && X == 10 && X != 3);
		System.out.println();
		
		
		// Operador ||
		System.out.println(X == 10 || X <= 20);
		System.out.println(X > 0 || X != 3);
		System.out.println(X <= 0 || X != 3 || X != 5);
		System.out.println();
		
		
		// Operador !
		System.out.println(!(X == 10));
		System.out.println(!(X >= 2));
		System.out.println(!(X <= 20 && X == 10));
		System.out.println();
		
	}

}
