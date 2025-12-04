package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula039_switch_case {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7. Representando um dia da
		 * semana (sendo 1 = domingo e 2 = segunda e assim por diante). Escrever na tela
		 * o dia da semana correspondente, conforme exemplos.
		 */

		// Bibliotecas:
		Locale.setDefault(Locale.US);

		// Variáveis:
		Scanner sc = new Scanner(System.in);
		int numero;
		String dia;

		// Programa
		System.out.print("Digite o dia da Semana: ");
		numero = sc.nextInt();

		switch (numero) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;

		case 3:
			dia = "Terça";
			break;

		case 4:
			dia = "Quarta";
			break;

		case 5:
			dia = "Quinta";
			break;

		case 6:
			dia = "Sexta";
			break;

		case 7:
			dia = "Sábado";
			break;

		default:
			dia = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		// Fecha Scanner:
		sc.close();

	}

}
