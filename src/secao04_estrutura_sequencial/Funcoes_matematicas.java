package secao04_estrutura_sequencial;

import java.util.Locale;

public class Funcoes_matematicas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		 * - Algumas funções matemáticas em Java:
		 * 
		 * 		Raiz quadrada: Math.sqrt(x)
		 * 		Potenciação: Math.pow(x, y)
		 * 		Valor absoluto: Math.abs(x) - Valor sem o negativo, caso exista.
		 */
		
		
		// Variáveis:
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		
		// - Raiz quadrada:
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);

		System.out.printf("Raiz quadrada de %.1f = %.3f %n", x, A);
		System.out.printf("Raiz quadrada de %.1f = %.1f %n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.1f %n", C);
		System.out.println();
		
		
		// - Potenciação:
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println();
		
		
		// - Valor absoluto:
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
	}

}
