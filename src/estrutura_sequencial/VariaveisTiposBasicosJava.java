package estrutura_sequencial;

public class VariaveisTiposBasicosJava {
	
	public static void main(String[] args) {
		
		/**
		 * # Tipos primitivos em Java
		 * 
		 * - Numéricos inteiros: 
		 * 		
		 * 		TIPO		TAMANHO		VALORES											VALOR PADRÃO
		 * 
		 * 		byte		8 bits		-128 a 127										0
		 * 		short		16 bits		-32768 a 32767									0
		 * 		int			32 bits		-2147483648 a 2147483647						0
		 * 		long		64 bits		-9223372036854770000 a 9223372036854770000		0L
		 * 
		 * 
		 * - Numéricos com ponto flutuante: 
		 * 		
		 * 		TIPO		TAMANHO		VALORES											VALOR PADRÃO
		 * 
		 * 		float		32 bits		-1,4024E-37 a 3,4028E+38						0.0f
		 * 		double		64 bits		-4,94E-307 a 1,79E+308							0.0
		 * 
		 * 
		 * - Caractére unicode: 
		 * 		
		 * 		TIPO		TAMANHO		VALORES											VALOR PADRÃO
		 * 
		 * 		char		16 bits		'\u0000' a '\uFFFF'						        '\u0000'
		 * 
		 * 
		 * - Valor verdade: 
		 * 		
		 * 		TIPO		TAMANHO		VALORES											VALOR PADRÃO
		 * 
		 * 		boolean		1 bit		{false, true}						        	false
		 * 
		 * 
		 * - String: Cadeia de caracteres (palavras ou textos) 
		 */
		
		
		// Declaração de variáveis:
		int idade = 38;
		double altura = 1.75;
		char sexo = 'M';
		
		
		// Iprimindo a variável:
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(sexo);
		
	}

}
