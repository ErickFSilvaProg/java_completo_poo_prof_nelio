package secao04_estrutura_sequencial;

public class Aula033_funcoes_matematicas_em_java {
	
	/**
	 * - Algumas funções matemáticas em java:
	 * 
	 * 		A = Math.sqrt(x)   -> Variável 'A' recebe a raiz quadrada de x.
	 * 		A = Math.pow(x, y) -> Variável 'A' recebe o resultado de 'x' elevado a 'y'.
	 * 		A = Math.abs(x)    -> Variável 'A' recebe p valor absoluto de 'x'.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		
//		Programa:
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + 25.0 + " = " + C);
		
	}

}
