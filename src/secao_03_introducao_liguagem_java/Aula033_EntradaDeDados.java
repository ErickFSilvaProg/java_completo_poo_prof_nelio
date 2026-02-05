package secao_03_introducao_liguagem_java;

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
	 */
	
	public static void main(String[] args) {
			
	//		Criando o objeto Scanner:
			Scanner entradaDados = new Scanner(System.in);
			
			
	//		Variáveis:
			String palavra;
			
			
	//		Para ler uma palavra, sem espaço:
			System.out.print("Digite uma palavra: ");
			palavra = entradaDados.next();
			System.out.println("Você digitou: " + palavra);
			
			
	//		Fecha o Scanner:
			entradaDados.close();
			
	}

}
