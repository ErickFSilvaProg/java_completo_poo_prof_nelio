package secao_04_estrutura_sequencial;

public class ProcessamentoDadosJavaCasting {
	
	public static void main(String[] args) {
		
//		- Processamento de dados - Casting.
		
//		Exemplo 1:
		
		int var1, var2;
		var1 = 5;
		var2 = 2 * var1;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println();
		
		
//		Exemplo 2:
		
		int var3;
		double var4;
		
		var3 = 5;
		var4 = 2 * var3;
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println();
		
		
//		Exemplo 3:
		
		double b, B, h, area;
		float bb, BB, hh, AREA;
		
		// double
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		// float
		bb = 6f;
		BB = 8f;
		hh = 5f;
		
		area = (b + B) / 2.0 * h;
		AREA = (bb + BB) / 2f * hh;
		
		System.out.println(area);
		System.out.println(AREA);
		System.out.println();
		
		
//		Exemplo 4:
		
		int var5, var6;
		double resultado;
		
		var5 = 5;
		var6 = 2;
		resultado = (double) var5 / var6; // Casting: conversão explícita de tipos de dados.
		
		System.out.println(resultado);
		
		
//		Exemplo 5:
		
		double var7;
		int var8;
		
		var7 = 5.0;
		var8 = (int) var7;
		
		System.out.println(var8);
		
	}

}
