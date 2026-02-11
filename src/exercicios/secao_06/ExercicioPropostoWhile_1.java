package exercicios.secao_06;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoWhile_1 {
	
	/*
	 	Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
	 	
	 	Escreva um programa que repita a leitura de uma senha até que ela seja válida.
	 	Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
	 	Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
	 	Considere que a senha correta é o valor 2002.
	 	
	 */
	
	public static void main(String[] args ) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
//		Variáveis:
		int senha;
		
//		Programa:
		System.out.print("Informe a senha: ");
		senha = scan.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha Inválida\n");
			
			System.out.print("Informe a senha: ");
			senha = scan.nextInt();
			
		}
		
		System.out.println("\nAcesso Permitido\n");
		
		scan.close();
		
	}

}
