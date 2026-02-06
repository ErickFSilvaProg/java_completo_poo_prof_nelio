package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula042_estruturaCondicional {
	
	/*
	 * 
	 * → Extrutura condicional:
	 * 
	 * 		É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Objetos:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Variáveis:
		double hora;
		
		
//		Pergunta:
		System.out.print("Que horas? ");
		hora = sc.nextDouble();
		sc.nextLine();
		
		
//		Extrutura condicional:
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		
//		Fecha o objeto Locale:
		sc.close();
		
	}

}
