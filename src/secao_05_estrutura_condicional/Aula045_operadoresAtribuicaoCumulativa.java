package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula045_operadoresAtribuicaoCumulativa {
	
	/*
	 * → Operadores de atribuição cumulativa:
	 * 
	 * 		+=	↔	Adição e atribuição.
	 * 		-=	↔	Subtração e atribuição.
	 * 		*=	↔	Multiplicação e atribuição.
	 * 		/=	↔	Divisão e atribuição.
	 * 		%=	↔	Módulo e atribuição.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int minutos;
		double conta = 50.00;
		
		System.out.print("Informe os minutos utilizados: ");
		minutos = scan.nextInt();
		scan.nextLine();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor da conta = R$ %.2f", conta);
		
		scan.close();
		
	}

}
