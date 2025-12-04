package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_while_01 {
	
	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
		 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
		 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
		 * Considere que a senha correta é o valor 2002.

		 */
		
		
//		Bibliotecas importadas:
		Scanner sc = new Scanner(System.in);
		
//		Variáveis:
		String senhaSistema = "2002";
		String senhaLogin;
		
		
//		Programa:
		System.out.print("Digite a senha: ");
		senhaLogin = sc.next();
		
		while(!senhaLogin.equals(senhaSistema)) {
			
			System.out.println("Senha Inválida");
			
			System.out.println();
			System.out.print("Digite a senha: ");
			senhaLogin = sc.next();
		}
		
		System.out.println("Acesso Permitido");
		
		
//		Fecha Scanner:
		sc.close();
		
	}

}
