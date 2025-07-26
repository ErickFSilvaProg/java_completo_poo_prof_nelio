package exercicios.exercicios_secao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5_estrutura_sequencial {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		
		/*
		 * - Exercício 5:
		 * 
		 * Fazer um programa para ler:
		 * 		
		 * 		O código da peça 1
		 * 		O número de peças 1
		 * 		O valor unitário de cada peça 1
		 * 		
		 * 		O código da peça 2
		 * 		O número de peças 2
		 * 		O valor unitário de cada peça 2
		 * 
		 * Calcule e mostre o valor a ser pago.
		 */
		
		
		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double vlrPeca1, vlrPeca2, vlrTotal;
		
		
		// Entrada de dados: Peça 1
		System.out.print("Código da peça 1: ");
		codPeca1 = sc.nextInt();
//		System.out.println();
		
		System.out.print("Valor da peça 1: ");
		vlrPeca1 = sc.nextDouble();
//		System.out.println();
		
		System.out.print("Quantidade de peça 1: ");
		qtdPeca1 = sc.nextInt();
		System.out.println();
		
		
		// Entrada de dados: Peça 2
		System.out.print("Código da peça 2: ");
		codPeca2 = sc.nextInt();
//		System.out.println();
		
		System.out.print("Valor da peça 2: ");
		vlrPeca2 = sc.nextDouble();
//		System.out.println();
		
		System.out.print("Quantidade de peça 2: ");
		qtdPeca2 = sc.nextInt();
		System.out.println();
		
		
		// Processamento de dados:
		vlrTotal = (vlrPeca1 * qtdPeca1) + (vlrPeca2 * qtdPeca2);
		
		
		// Saída do programa:
		System.out.println("VALOR A PAGAR: R$ " + vlrTotal);
		
		
		// Fecha o Scanner
		sc.close();
		
	}

}
