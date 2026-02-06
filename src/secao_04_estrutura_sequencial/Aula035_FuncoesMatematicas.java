package secao_04_estrutura_sequencial;

public class Aula035_FuncoesMatematicas {
	
	/*
	 * → Funções matemáticas em Java:
	 * 
	 * 		Math.sqrt() → Raiz quadrada
	 * 		Math.pow()  → Potenciação
	 * 		Matrh.abs() → Valor absoluto
	 * 
	 * 		Para mais informações: java.lang.Math
	 * 
	 * 
	 * → Para inpressão com o 'printf()':
	 * 
	 * 		%n - Quebra de linha
	 * 		%f - Ponto flutuante
	 * 		%d - Inteiro
	 * 		%s - Texto
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		
//		Raiz quadrada:
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", x, A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + 25 + " = " + C);
		System.out.println();
		
		
//		Potenciação:
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado " + B);
		System.out.println(5.0 + " elevado ao quadrado " + C);
		System.out.println();
		
		
//		Valor absoluto:
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
	}

}
