package secao04_estrutura_sequencial;

public class Aula027_variaveis_tipos_basicos {
	
	/**
	 * - Definição informal:
	 * 
	 * 		Em programação, uma variável é uma porção de memória (RAM) utilizada para armazenar dados durante a execução dos programas.
	 * 
	 * - Declaração de variáveis:
	 * 
	 * 		Ex.: [tipo] [nome] = [valor inicial]
	 * 
	 * 
	 * - Uma variável possui:
	 * 
	 * 		Tipo
	 * 		Nome (ou identificador)
	 * 		Valor
	 * 		Endereço
	 * 
	 * 
	 * - Tipos primitivos em Java:
	 * 
	 * 		-- Tipos numéricos inteiros:
	 * 			
	 * 			byte -> 8 bits -> -128 a 127
	 * 			short -> 16 bits -> -32.768 a 32.767
	 * 			int -> 32 bits -> -2.147.483.648 a 2.147.483.647
	 * 			long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
	 * 
	 * 
	 * 		-- Tipos numéricos com ponto flutuante:
	 * 
	 * 			float -> 32 bits -> -1,4024E-37 a 3,4028E+38
	 * 			double -> 64 bits -> -4,94E-307 a 1,79E+308
	 * 
	 * 
	 * 		-- Tipo unicode:
	 * 
	 * 			char -> 16 bits -> '\u0000' a '\uFFFF'
	 * 				
	 * 				Exemplo: 'a' = '\u0061'
	 * 
	 * 
	 * 		-- Tipo boolean:
	 * 
	 * 			boolean -> 1 bit -> false , true
	 * 
	 * 
	 * - Tipo String (Não é um tipo primitivo):
	 * 
	 * 		-- Cadeia de caracteres (palavras ou textos)
	 * 
	 * 			"Programação em Java"
	 * 
	 * 
	 * - Nomes de variável:
	 * 
	 * 		-- Não pode começar com dígito. Use uma letra ou _
	 * 
	 * 			String nome
	 * 			int _5minutos
	 * 
	 * 		-- Não pode ter espaço em branco
	 * 
	 * 		-- Não usar acentos ou til
	 * 
	 * 		-- Sugestão: use o padão CamelCase
	 * 
	 */
	
	public static void main(String[] args) {
		
//		Exemplos de tipos:
		
		int idade = 39;
		System.out.println(idade);
		
		double altura = 1.75;
		System.out.println(altura);
		
		char sexo = 'M';
		System.out.println(sexo);
		
	}

}
