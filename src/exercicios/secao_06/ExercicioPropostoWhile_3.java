package exercicios.secao_06;

import java.util.Scanner;

public class ExercicioPropostoWhile_3 {
	
	/*
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
	 * Escreva um algoritmo para ler o tipo de combustível abastecido, codificado da seguinte forma: 
	 * 		
	 * 		1.Álcool 
	 * 		2.Gasolina 
	 * 		3.Diesel
	 * 		4.Fim 
	 * 
	 * Caso o usuário informe um código inválido, fora da faixa de 1 a 4, deve ser solicitado um novo código até que seja válido.
	 * O programa será encerrado quando o código informado for o número 4.
	 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de combustíveis abastecidos.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis:
		int codCombustivel;
		int etanol = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
//		Programa:
		System.out.print("Código do combustível: ");
		codCombustivel = scan.nextInt();
		scan.nextLine();
		
		while (codCombustivel != 4) {
		
			if (codCombustivel < 1 || codCombustivel > 4) {
				System.out.println("Código de combustível inválido!\n");
				
			}
			else {
				
				if (codCombustivel == 1) {
					etanol += 1;
					System.out.println("Etanol\n");
					
				}
				else if (codCombustivel == 2) {
					gasolina += 1;
					System.out.println("Gasolina\n");
					
				}
				else if (codCombustivel == 3) {
					diesel += 1;
					System.out.println("Diesel\n");
					
				}
			
			}
			
			System.out.print("Código do combustível: ");
			codCombustivel = scan.nextInt();
			scan.nextLine();
			
		}
		
		System.out.println("Sair");
		
		if (etanol != 0 || gasolina != 0 || diesel != 0) {
			System.out.println("\nMUITO OBRIGADO!"
					+ "\nAlcool: " + etanol
					+ "\nGasolina: " + gasolina
					+ "\nDiesel: " + diesel);
			
		}
		
		System.out.println("\nFIM, OK!\n");
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
