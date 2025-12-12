package secao04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula031_entrada_de_dados_parte1 {
	
	/**
	 * - Entrada de dados ou Leitura: Scanner
	 * 
	 * 		-- Para fazer entrada de dados, criamos um objeto do tipo "Scanner":
	 * 
	 * 			import java.util.Scanner; [Precisa importar o 'java.util' antes da declaração]
	 * 
	 * 			Scanner sc = new Scanner(System.in)
	 * 			sc.close() [Quando não precisar mais do objeto 'sc']
	 * 
	 * 
	 * - Atenção a quebra de linha pendente:
	 * 
	 * 		-- Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica pendente na entrada padrão. Ao fazer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		String palavra;
		String frase;
		int numeroInteiro;
		double numeroFlutuante;
		char sexo;
		
		
//		Programa:
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Para ler uma palavra:
		
		System.out.print("Digite uma palavra: ");
		palavra = sc.next();
		System.out.println("Palavra digitada: " + palavra);
		
		
		// Para ler um número inteiro:
		
		System.out.print("\nDigite um número inteiro: ");
		numeroInteiro = sc.nextInt();
		System.out.println("Número digitado: " + numeroInteiro);
		
		
		// Para ler um número com ponto flutuante:
		
		System.out.print("\nDigite um número com ponto flutuante: ");
		numeroFlutuante = sc.nextDouble();
		System.out.println("Número digitado: " + numeroFlutuante);
		
		
		// Para ler um caracter:
		
		System.out.print("\nDigite o sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Sexo digitado: " + sexo);
		
		
		// Para ler até a quebra de linha:

		sc.nextLine(); // Limpa o buffer de leitura. Consome a quebra de linha pendente do 'next' anterior.
		System.out.print("\nDigite uma frase: ");
		frase = sc.nextLine();
		System.out.println("Frase digitada: " + frase);
		
		
		// ...
		System.out.println("\nFim da operação");
		
		
//		Fecha o Scanner:
		sc.close();
		
	}

}
