package secao_03_introducao_liguagem_java;

import java.util.Locale;
import java.util.Scanner;

public class Aula034_EntradaDeDados {
	
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
	 * 		→ Atenção à quebra de linha pendente:
	 * 
	 * 			Quando digitamos um comando de leitura diferente do nextLine() e damos alguma quebra de linha, essa quebra de linha fica pendente na entrada padrão.
	 * 			Para solucionar essa pendência, damos um nextLine() vazio para aquela quebra de linha pendente.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		→
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		int ano;
		
		
//		Para ler um texto até a quebra de linha:
		System.out.print("Qual o ano? ");
		ano = entradaDados.nextInt();
		entradaDados.nextLine();
		
		System.out.println("\nDigite três palavras/frases: ");
		palavra1 = entradaDados.nextLine();
		palavra2 = entradaDados.nextLine();
		palavra3 = entradaDados.nextLine();
		
		System.out.println("\nDADOS DIGITADOS: ");
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		System.out.println(ano);
		
		
//		→
		entradaDados.close();
		
	}

}
