package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula047_expressaoCondicionalTernaria {
	
	/*
	 * → Expressão condicional ternária:
	 * 
	 * 		Estrutura opcional ao if-else quando se deseja dicidir um valor com base em uma condição:
	 * 
	 * 		• Sintaxe:
	 * 
	 * 				(condição) ? valor_se_verdadeiro : valor_se_falso
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = 0.0;
		
		
//		Alternativa com o "if":
		if (preco < 20) {
			desconto = preco * 0.1; 
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println("Desconto: " + desconto);
		
		
//		Alternativa com a condição ternária:
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: " + desconto);
		
		
		sc.close();
		
	}

}
