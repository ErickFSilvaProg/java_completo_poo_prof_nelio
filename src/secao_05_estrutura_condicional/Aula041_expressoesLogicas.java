package secao_05_estrutura_condicional;

public class Aula041_expressoesLogicas {
	
	/*
	 * → Expressões lógicas:
	 * 
	 * 		Assim como nas expressões comparativas, as expressões lógicas são também expressões que quando avaliadas resultam em um valor verdade. Verdadeido ou falso
	 * 
	 * 
	 * 		→ Operadores lógicos:
	 * 
	 * 			• Operador:		• Significado:
	 * 
	 * 				&&				E
	 * 				||				OU
	 * 				!				NÃO
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		int valorInt = 5;
		
//		Expressão: E
		boolean expressao1 = valorInt <= 20 && valorInt == 10;
		boolean expressao2 = valorInt > 0 && valorInt != 3;
		boolean expressao3 = valorInt <= 20 && valorInt == 10 && valorInt != 3;
		
//		Expressão: OU
		boolean expressao4 = valorInt == 10 || valorInt <= 20;
		boolean expressao5 = valorInt > 0 || valorInt != 3;
		boolean expressao6 = valorInt <= 0 || valorInt != 3 || valorInt != 5;
		
//		Expressão: NÃO
		boolean expressao7 = !(valorInt == 10);
		boolean expressao8 = !(valorInt >= 2);
		boolean expressao9 = !(valorInt <= 20 && valorInt == 10);
		
		System.out.println(expressao1);
		System.out.println(expressao2);
		System.out.println(expressao3);
		
		System.out.println(expressao4);
		System.out.println(expressao5);
		System.out.println(expressao6);
		
		System.out.println(expressao7);
		System.out.println(expressao8);
		System.out.println(expressao9);
		
	}

}
