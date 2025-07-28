package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_for_02 {
	
	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de 
		 * valores inteiros X que serão lidos em seguida.
		 * 
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] 
		 * e quantos estão fora do intervalo, mostrando essas informações 
		 * conforme exemplo (use a palavra "in" para dentro do intervalo, 
		 * e "out" para fora do intervalo).
		 */
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int n, x;
		int in = 0;
		int out = 0;
		
		// Programa:
		System.out.print("Número de iterações: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print("Digite o " + i + "º número: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				
				in += 1;
			}
			else {
				
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		// Fecha o Scanner:
		sc.close();
		
	}

}
