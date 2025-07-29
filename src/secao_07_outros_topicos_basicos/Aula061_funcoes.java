package secao_07_outros_topicos_basicos;

import java.util.Scanner;

public class Aula061_funcoes {
	
//	Função método principal da classe: Aula061_funcoes
	public static void main(String[] args) {
		
		// Declara a variável do tipo Scanner:
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 * # Funções: 
		 * 
		 * 	- Representam um processamento que possui um significado:
		 * 
		 * 		Math.sqrt(double)
		 * 		System.out.println(string)
		 * 
		 * 
		 *  - Principais vantagens: modularização, delegação, reaproveitamento.
		 *  
		 *  
		 *  - Dados de entrada e saída:
		 *  
		 *  	Funções podem receber dados de entrada (parâmetros ou argumentos).
		 *  	Funções podem ou não retornar uma saída.
		 *  
		 *  
		 *  - Em orientação a objetos, funções em classes recebem o nome de 'métodos'.
		 */
		
		
		// Exemplo 1:
		double y = 25.0;
		double x = Math.sqrt(y);
		System.out.println(x);
		
		
		// Exemplo 2: Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
		System.out.println("Enter three number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// Chamando funções:
		int higher = max(a, b, c);
		showResult(higher);
		
		
		// Fecha o Scanner:
		sc.close();
		
	}
	
	
//	Função que retorna um inteiro:
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	
//	Função que imprime na tela:
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
	}

}
