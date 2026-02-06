package secao_04_estrutura_sequencial;

public class Aula032_ProcessamentoDeDadosCasting {
	
	/*
	 * → Processamento de dados
	 * 
	 * 		→ Comando de atribuição
	 * 
	 * 			variável = expressão
	 * 					 ↑
	 * 			   (Lê-se: recebe)
	 * 
	 * 
	 * → Boas práticas:
	 * 
	 * 		Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
	 * 
	 * 		• Para double use: .0
	 * 		• Para float use: f
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Exemplo 1:
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		
//		Exemplo 2:
		
		int x2;
		double y2;
		
		x2 = 5;
		y2 = 2 * x2;
		
		System.out.println(x2);
		System.out.println(y2);
		
		
//		Exemplo3:
		
		double b, B, h, area3;
		float bf, Bf, hf, area3f;
		
		b = 6.0;
		bf = 6f;
		
		B = 8.0;
		Bf = 8f;
		
		h = 5.0;
		hf = 5f;
		
		area3 = (b + B) / 2.0 * h;
		area3f = (bf + Bf) / 2f * hf;
		
		System.out.println(area3);
		System.out.println(area3f);
		
		
//		Exemplo 4:
		
		int a4, b4;
		double resultado;
		
		a4 = 5;
		b4 = 2;
		
		resultado = (double) a4 / b4;
		
		System.out.println(resultado);
		
		
//		Exemplo 5:
		
		double a5;
		int b5;
		
		a5 = 5.0;
		b5 = (int) a5;
		
		System.out.println(b5);
		
	}

}