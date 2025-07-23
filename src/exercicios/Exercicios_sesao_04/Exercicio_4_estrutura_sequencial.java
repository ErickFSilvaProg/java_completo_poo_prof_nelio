package exercicios.Exercicios_sesao_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4_estrutura_sequencial {
	
	public static void main(String[] args) {
		
		/*
		 * - Exercício 4:
		 * 
		 * Fazer um programa que leia:
		 * 
		 * 		O número de um funcionário;
		 * 		Seu número de horas trabalhadas;
		 * 		O valor que recebe por hora;
		 * 		Calcule o salário desse funcionário.
		 * 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 */
		
		
		Locale.setDefault(Locale.US);
		
		
		// Variáveis
		Scanner sc = new Scanner(System.in);
		int numFuncionario;
		double horasTrabalhadas, valorHoras, salario;
		
		
		// Programa
		System.out.print("Número do funcionário: ");
		numFuncionario = sc.nextInt();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.print("Valor da hora trabalhada: ");
		valorHoras = sc.nextDouble();
		System.out.println();
		
		
		salario = horasTrabalhadas * valorHoras;
		
		
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", numFuncionario, salario);
		
		
		// Fecha o obejeto Scanner
		sc.close();
		
	}

}
