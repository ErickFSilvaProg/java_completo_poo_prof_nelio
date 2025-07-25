package exercicios.exercicios_secao_05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
	
	public static void main(String[] args) {
		
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente 
		 * uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
		 * este valor se encontra. 
		 * 
		 * Obviamente se o valor não estiver em nenhum destes intervalos, 
		 * deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		
		
//		CHAMADAS À BIBLIOTECAS:
		Locale.setDefault(Locale.US);
		
		
//		VARIÁVEIS:
		Scanner scan = new Scanner(System.in);
		double numero;
		
		
//		PROGRAMA:
		System.out.print("Digite um número: ");
		numero = scan.nextDouble();
		
		if (numero < 0 || numero > 100) {
			
			System.out.println("Fora de intervalo");
		}
		else {
			
			if (numero >= 0 && numero <= 25) {
				
				System.out.println("Interlavo [0,25]");
			}
			else {
				
				if (numero > 25 && numero <= 50) {
					
					System.out.println("Intervalo (25,50]");
				}
				else {
					
					if (numero > 50 && numero <= 75) {
						
						System.out.println("Intervalo (50,75]");
					}
					else {
						
						if (numero > 75 && numero <= 100) {
							
							System.out.println("Intervalo (75,100]");
						}
					}
				}
			}
		}
		
		scan.close();
		
	}

}
