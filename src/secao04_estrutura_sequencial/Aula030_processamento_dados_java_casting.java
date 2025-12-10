package secao04_estrutura_sequencial;

public class Aula030_processamento_dados_java_casting {
	
	/**
	 * - Processamento de dados:
	 * 
	 * 		[tipo] [variavel] = [expressao]
	 * 
	 * 
	 * - Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
	 * 
	 * 		-- Para double use: [número].0
	 * 		-- Para float use: [número]f
	 * 
	 * 
	 * - Casting: Conversão explicita de valores.
	 */
	
	public static void main(String[] args) {
		
//		Variáveis:
		
		int x = 5;
		int y = 2 * x;
		int a2 = 5;
		int b2 = 2;

		double a3 = 5.0;
		double y2 = 2 * x;
		double b = 6.0;
		double B = 8.0;
		double h = 5.0;
		double area = (b + B) / 2.0 * h;
		double resultado = a2 / b2;
		
		
//		Exemplo 1:
		
		System.out.println(x);
		System.out.println(y);
		
		
//		Exemplo 2:
		
		System.out.println(x);
		System.out.println(y2);
		
		
//		Exemplo 3: Calcule a área de um trapézio.
		
		System.out.println(area);
		
		
//		Exemplo 4: Casting.
		
		System.out.println(resultado);
		
		resultado = (double) a2 / b2;
		System.out.println(resultado);
		
		
//		Exemplo 5: Casting.

		int b3 = (int) a3;
		System.out.println(b3);
		
	}

}
