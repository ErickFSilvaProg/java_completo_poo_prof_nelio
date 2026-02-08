package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula046_switchCase {
	
	/*
	 * → Estrutura switch-case:
	 * 
	 * 		Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável,
	 * 		ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar o switch-case.
	 * 
	 * 
	 * → Exercício:
	 * 		
	 * 		Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana.
	 * 		Sendo 1 → domingo, 2 → segunda e assim por diante.
	 * 		Escreva na tela o dia da semana correspondente.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
//		Variáveis:
		int dia;
		String diaSemana;
		
//		Entrada de dados:
		System.out.print("Informe um número da semana: ");
		dia = scan.nextInt();
		scan.nextLine();
		
//		Programa:
		switch (dia) {
		case 1:
			diaSemana = "Domingo";
			break;
			
		case 2:
			diaSemana = "Segunda";
			break;
			
		case 3:
			diaSemana = "Terça";
			break;
			
		case 4:
			diaSemana = "Quarta";
			break;
			
		case 5:
			diaSemana = "Quinta";
			break;
			
		case 6:
			diaSemana = "Sexta";
			break;
			
		case 7:
			diaSemana = "Sábado";
			break;
			
		default:
			diaSemana = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaSemana);
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
