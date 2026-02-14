package exercicios.secao_06;

import java.util.Scanner;

public class ExercicioPropostoFor_2 {
	
	/*
	 * Leia um valor inteiro N.
	 * Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
	 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo.
	 * Mostrando essas informações conforme exemplo, use a palavra "in" para dentro do intervalo 
	 * e "out" para fora do intervalo.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Biblioteca:
		Scanner scan = new Scanner(System.in);
		
//		Variáveis:
		int qtdNum;
		int numLido;
		int numIn = 0;
		int numOut = 0;
		
//		Programa:
		System.out.print("Quantidade de números: ");
		qtdNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		for (int i = 1; i <= qtdNum; i++) {
			System.out.print(i + "º valor: ");
			numLido = scan.nextInt();
			
			if (numLido >= 10 && numLido <= 20) {
				numIn += 1;
			}
			else {
				numOut += 1;
			}
			
		}
		
		System.out.println();
		System.out.println(numIn + " in");
		System.out.println(numOut + " out");
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
