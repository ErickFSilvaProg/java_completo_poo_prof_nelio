package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_06 {
	
	public static void main(String[] args) {
		
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 */
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				
				System.out.println(i);
			}
		}
		
		scan.close();
		
	}

}
