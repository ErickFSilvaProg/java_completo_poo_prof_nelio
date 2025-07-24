package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula038_operadores_atribuicao_cumulativa {
	
	public static void main(String[] args) {
		
		/*
		 * - Operadores de atribuição cumulativa:
		 * 
		 * 		a += b  ->  a = a + b
		 * 		a -= b  ->  a = a - b
		 * 		a *= b  ->  a = a * b
		 * 		a /= b  ->  a = a / b
		 * 		a %= b  ->  a = a % b
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
		 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
		 * Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		
		
//		Chamadas à bibliotecas:
		Locale.setDefault(Locale.US);
		
		
//		Variáveis:
		Scanner scan = new Scanner(System.in);
		double conta = 50.00;
		int minutos;
		
		
//		Programa:
		System.out.print("Minutos consumidos: ");
		minutos = scan.nextInt();
		
		if (minutos > 100) {
			
			conta += (minutos - 100 ) * 2.00;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", conta);
		
		
//		Fecha o Scanner;
		scan.close();
		
	}

}
