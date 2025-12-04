package secao_05_estrutura_condicional;

public class Aula040_expressao_condicional_ternaria {
	public static void main(String[] args) {
		
		/*
		 * Estrutura opcional ao 'if-else' quando se deseja decidir um valor com base em uma condição.
		 * 
		 * (condição) ? valor_verdadeiro : valor_falso;
		 */
		
		
		// variáveis:
		double preco, desconto;
		
		
		// Exemplo:
		System.out.println((2 > 4) ? "Sim" : "Não");
		System.out.println((10 != 3) ? "Sim" : "Não");
		
		
		// Sem a 'expressão condicional ternária':
		preco = 34.5;
		
		if (preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		
		// Com a 'expressão condicional ternária':
		preco = 34.5;
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}
}
