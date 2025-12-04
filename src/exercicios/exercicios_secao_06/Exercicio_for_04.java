package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_04 {
	
	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número N. 
		 * 
		 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
		 * 
		 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		int num1, num2;
		double divisao;
		
		System.out.print("Quantas repetições: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Valores da " + i + "ª repetição:");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num2 == 0) {
				
				System.out.println("Divisão impossível");
			}
			else {

				divisao = (double) num1 / num2;
				System.out.println(divisao);
			}
		}
		
		sc.close();
		
	}

}
