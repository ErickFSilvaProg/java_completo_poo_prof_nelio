package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula051_debugEclipse {
	
	/*
	 * → Como executar o debug do eclipse:
	 * 
	 * 		• Para marcar uma linha de breakpoint:
	 * 
	 * 			run ↪ Toggle Breakpoint
	 * 
	 * 		• Para iniciar o debug:
	 * 
	 * 			Botão direito na classe  ↪ Debug as ↪ Java Application
	 * 
	 * 		• Para executar uma linha:
	 * 
	 * 			F6
	 * 
	 * 		• Para interromper o debug:
	 * 
	 * 			⏹️ (Stop)
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		double largura = 0.0;
		double comprimento = 0.0;
		double metroQuadrado = 0.0;
		double area = 0.0;
		double preco = 0.0;
		
		
//		Programa:
		System.out.print("Informe a largura: ");
		largura = scan.nextDouble();
		
		System.out.print("Informe o comprimento: ");
		comprimento = scan.nextDouble();
		
		System.out.print("Informe o metro quadrado: ");
		metroQuadrado = scan.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f", preco);
		
		
		scan.close();
		
	}

}
