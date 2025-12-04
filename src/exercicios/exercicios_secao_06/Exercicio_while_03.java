package exercicios.exercicios_secao_06;

import java.util.Scanner;

public class Exercicio_while_03 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes.
		 * 
		 * Escreva um algoritmo para ler o tipo de combustível abastecido, codificado da
		 * seguinte forma:
		 * 
		 * 1.Álcool; 2.Gasolina; 3.Diesel; 4.Fim;
		 * 
		 * Caso o usuário informe um código inválido, fora da faixa de 1 a 4 deve ser
		 * solicitado um novo código até que seja válido.
		 * 
		 * O programa será encerrado quando o código informado for o número 4.
		 * 
		 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
		 * abasteceram cada tipo de combustível, conforme exemplo.
		 */

//		Bibliotecas:
		Scanner sc = new Scanner(System.in);

//		Variáveis:
		int entrada;
		int alcool = 0;
		int gasolina = 0;
		int Diesel = 0;

//		Programa:
		System.out.print("Combustível abastecido: ");
		entrada = sc.nextInt();

		while (entrada != 4) {

			switch (entrada) {
			case 1:
				alcool += 1;
				break;

			case 2:
				gasolina += 1;
				break;

			case 3:
				Diesel += 1;
				break;
			}

			System.out.print("Combustível abastecido: ");
			entrada = sc.nextInt();
		}

		System.out.println();
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + Diesel);

//		Fecha o Scanner:
		sc.close();

	}

}
