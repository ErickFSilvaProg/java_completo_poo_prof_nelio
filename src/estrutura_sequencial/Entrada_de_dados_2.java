package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_2 {
	
	public static void main(String[] args) {
		
		// Objeto Locale:
		Locale.setDefault(Locale.US);
		
		// Objeto Scanner:
		Scanner sc = new Scanner(System.in);
		
		// Variáveis:
		String s1, s2, s3;
		int x;
		
		// Para ler um texto até a quebra de linha: Atenção a quebra de linha pendente!
		/*
		x = sc.nextInt(); // Aqui gerará uma quebra de linha não consumida.
		s1 = sc.nextLine(); // Este 'nextLine()' consumirá a quebra de linha acima.
		s2 = sc.nextLine(); // O programa iniciará a próxima leitura aqui.
		s3 = sc.nextLine();
		*/
		
		/* 
			Quando você usa um comando de leitura diferente do 'nextLine()' e dá uma quebra de linha (enter), essa quebra de linha fica pendente na entrada padrão.
			
			Então, se você fizer um 'nextLine()', aquela quebra de linha pendente será absorvida pelo 'nextLine()'.
		*/
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		// Fechando o objeto Scanner:
		sc.close();
		
	}

}
