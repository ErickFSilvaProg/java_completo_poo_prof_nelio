package exercicios.secao_05;

import java.util.Scanner;

public class ExercicioProposto_4 {
	
	/*
	 * Leia a hora inicial e a hora final de um jogo.
	 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	 * 
	 * Link: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		
		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		
		System.out.println("\nO jogo durou " + duracao + " hora(s).");
		
		
		sc.close();
		
	}

}
