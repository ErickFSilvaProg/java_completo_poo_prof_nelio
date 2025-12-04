package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_01 {
	
	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). 
		 * Em seguida mostre os 'ímpares' de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um intervalo: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			
			if (i % 2 != 0) {
				
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
