package exercicios.exercicios_secao_05;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar 
		 * em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, tempoJogo;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			
			tempoJogo = horaFinal - horaInicial;
		}
		else {
			
			tempoJogo = (24 - horaInicial) + horaFinal;
		}
		
		System.out.println("O jogo durou " + tempoJogo + " hora(s)");
		
		sc.close();
		
	}

}
