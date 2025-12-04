package exercicios.exercicios_secao_05;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). 
		 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		 * indicando se os valores lidos são múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.print("Valor de A: ");
		A = sc.nextInt();
		
		System.out.print("Valor de B: ");
		B = sc.nextInt();
		
		System.out.println();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		sc.close();
		
	}

}
