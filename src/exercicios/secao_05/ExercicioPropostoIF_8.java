package exercicios.secao_05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto_8 {
	
	/*
	 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. 
	 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda. 
	 * Siga a tabela abaixo:
	 * 
	 * 
	 * 		• Renda								• IR
	 * 
	 * 		Entre R$ 0.00 à R$ 2000.00		→	Insento
	 * 		Entre R$ 2000.01 à R$ 3000.00	→	8%
	 * 		Entre R$ 3000.01 à R$ 4500.00	→	18%
	 * 		Acima de R$ 4500.00				→	28%
	 * 
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		double salario = 0.00;
		double valorIR = 0.00;
		boolean insento = false;
		
		
//		Entrada de dados:
		System.out.print("Informe o salário: ");
		salario = scan.nextDouble();
		scan.nextLine();
		
//		Programa:
		if (salario <= 2000.00) {
			insento = true;
			System.out.println("Insento");
		}
		else if (salario <= 3000.00) {
			valorIR = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.00) {
			valorIR = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else if (salario > 4500.00 ) {
			valorIR = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
//		Saído do programa:
		if (insento == false) {
			System.out.printf("R$ %.2f", valorIR);
		}
		
		
//		Fecha o Scanner:
		scan.close();
	}

}
