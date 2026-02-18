package secao_07_outros_topicos_basicos_java;

import java.util.Scanner;

public class Aula065_operadoresBitwise {
	
	/*
	 * — Operadores Bitwise:
	 * 
	 * 		→ & ↔ Operação "E" (bit a bit)
	 * 		→ | ↔ Operação "OU" (bit a bit)
	 * 		→ ^ ↔ Operação "OU-exclusivo" ou XOR (bit a bit)
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Bibliotecas:
		Scanner scan = new Scanner(System.in);
		
		
//		Variáveis e seus binários:
		int n1 = 89; // 0101 1001
		int n2 = 60; // 0011 1100
		int mask = 0b00100000; // 32 em binário.
		int n;
		
				
//		Programa:
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
//		Outro programa:
		System.out.print("Informe um número: ");
		n = scan.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		
//		Fecha o Scanner:
		scan.close();
		
	}

}
