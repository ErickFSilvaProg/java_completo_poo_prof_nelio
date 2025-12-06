package secao04_estrutura_sequencial;

public class Aula026_expressoes_aritmeticas {
	
//	Operadores aritméticos:
	
	/*
	 *  (+) -> adição
	 *  (-) -> subtração
	 *  (*) -> multiplicação
	 *  (/) -> divisão
	 *  (%) -> módulo (resto da divisão)
	 * 
	 * */
	
//	Precedência 1º lugar: * / %
//	Predecência 2º lugar: + -
	
	public static void main(String[] args) {
		
		System.out.println(2 * 6 / 3);
		System.out.println(2 / 6 * 3); // O valor será diferente.
		
		System.out.println(3 + 2 * 4);
		
		System.out.println((3 + 2) * 4);
		
		System.out.println(60 / (3 + 2) * 4);
		
		System.out.println(60 / ((3 + 2) * 4));
		
		System.out.println(14 % 3);
		
		System.out.println(19 % 5);
		
	}

}
