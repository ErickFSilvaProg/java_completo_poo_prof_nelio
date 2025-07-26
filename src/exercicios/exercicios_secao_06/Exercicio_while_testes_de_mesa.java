package exercicios.exercicios_secao_06;

public class Exercicio_while_testes_de_mesa {
	
	public static void main(String[] args) {
		
//		Variáveis:
		double x, y;
		
		
//		Exercício 1:
		x = 5;
		y = 0;
		
		while (x > 2) {
			
			System.out.print(x + ", ");
			y += x;
			x -= 1;
		}

		System.out.println();
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println();
		
		
//		Exercício 2:
		x = 2;
		y = 0;
		
		while (x < 60) {
			
			System.out.print(x + ", ");
			
			x *= 2;
			y += 10;
		}

		System.out.println();
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println();
		
		
//		Exercicip 3:
		x = 100;
		y = 100;
		
		while (x != y) {
			
			System.out.print("Olha" + ", ");
			x = Math.sqrt(y);
		}
		
		System.out.println();
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println();
		
	}

}
