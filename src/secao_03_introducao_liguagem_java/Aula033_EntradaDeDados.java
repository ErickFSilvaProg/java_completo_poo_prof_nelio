package secao_03_introducao_liguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class Aula033_EntradaDeDados {
	
	/*
	 * → Entrada de Dados em Java:
	 * 
	 * 		Também chamada de Leitura de Dados.
	 * 
	 * 		→ Para fazer entrada de dados, criamos um objeto do tipo "Scanner".
	 * 
	 * 			Exemplo: Scanner sc = new Scanner(System.in);
	 * 
	 * 			Obs.: Quando não precisar mais do objeto Scanner, feche-o:
	 * 
	 * 				sc.close();
	 * 
	 * 		→ Para considerar o separador de decimais como ponto, antes da declaração do Scanner, faça:
	 * 
	 * 			Locale.setDefault(Locale.US);
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Declarando o "locale":
		Locale.setDefault(Locale.US);
			
//		Criando o objeto Scanner:
		Scanner entradaDados = new Scanner(System.in);
		
		
//		Variáveis:
		String nome;
		int anoAtual;
		double salarioAtual;
		float salarioDesejado;
		char genero;
		
		
//		Para ler uma palavra, sem espaço:
		System.out.print("Digite seu nome: ");
		nome = entradaDados.next();
		System.out.println("Você digitou: " + nome + "\n");
		
		
//		Para ler um caracter:
		System.out.print("Gênero [M] ou [F]: ");
		genero = entradaDados.next().charAt(0);
		System.out.println("Você digitou: " + genero + "\n");
		
		
//		Para ler um número inteiro:
		System.out.print("Digite o ano: ");
		anoAtual = entradaDados.nextInt();
		System.out.println("Você digitou: " + anoAtual + "\n");
		
		
//		Para ler um número com ponto flutuante:
		System.out.print("Digite seu salário: ");
		salarioAtual = entradaDados.nextDouble();
		System.out.print("Digite o salário desejado: ");
		salarioDesejado = entradaDados.nextFloat();
		System.out.println("Você digitou: R$" + salarioAtual + " e R$" + salarioDesejado + "\n");
		
		
//		Para ler vários dados na mesma linha:
		System.out.print("Digite seu nome, o ano e seu salário: ");
		nome = entradaDados.next();
		anoAtual = entradaDados.nextInt();
		salarioAtual = entradaDados.nextDouble();
		System.out.print("Você digitou: " + nome + ", " + anoAtual + ", " + salarioAtual);
		
		
//		Fecha o Scanner:
		entradaDados.close();
			
	}

}
