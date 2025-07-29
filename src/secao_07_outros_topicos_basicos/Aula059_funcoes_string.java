package secao_07_outros_topicos_basicos;

public class Aula059_funcoes_string {
	
	public static void main(String[] args) {
		
		/*
		 * # Funções para string:
		 * 
		 * 	- Formatar: 
		 * 
		 * 		toLowerCase(): Transformar em minúscula.
		 * 		toUpperCase(): Transformar em maiúscula.
		 * 		trim(): Remove espaços do início e do final do string.
		 * 
		 * 
		 *  - Recortar:
		 *  
		 *  	substring(inicio): Informando o início.
		 *  	substring(inicio, fim): Informando o início e o fim.
		 *  
		 *  
		 *  - Substituir:
		 *  
		 *  	Replace(char, char): Substitue caracteres.
		 *  	Replace(string, string): Substitue strings.
		 *  
		 *  
		 *  - Buscar:
		 *  
		 *  	indexOf: Realiza busca no início do string.
		 *  	lastIndexOf: Realiza busca no final do string.
		 *  
		 *  
		 *  - Recortar:
		 *  
		 *  	.split(" "): Divide o string com base em um separador.
		 */
		
		
//		                             1         2
//		                   0123456789012345678901234567
		String original = "abcde FGHIJ lmnop QRSTU VXWZ    ";
		
		
//		toLowerCase() - Convertendo para letras minúsculas:
		System.out.println("toLowerCase()");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.toLowerCase() + "|");
		System.out.println();
		
//		toUpperCase() - Convertendo para letras maiúsculas:
		System.out.println("toUpperCase()");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.toUpperCase() + "|");
		System.out.println();
		
//		trim() - Removendo espaços:
		System.out.println("trim()");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.trim() + "|");
		System.out.println();
		
		
//		substring(param) - Recorta e criando um novo string a partir da posição informada:
		System.out.println("substring(param)");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.substring(2) + "|");
		System.out.println();
		
//		substring(param1, param2) - Recorta e criando um novo string a partir da posição informada e parando antes da segunda posição:
		System.out.println("substring(param1, param2)");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.substring(2, 9) + "|");
		System.out.println();
		
		
//		replace(param1, param2) - Substitue os caracteres do string:
		System.out.println("replace(param1, param2)");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.replace("a", "@") + "|");
		System.out.println();
		
//		replace(param1, param2) - Substitue os substring do string:
		System.out.println("replace(param1, param2)");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.replace("abc", "@$%") + "|");
		System.out.println();
		
		
//		indexOf("param") - Realiza uma busca apartir do início do string:
		System.out.println("indexOf(\"param\")");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.indexOf("bc") + "|");
		System.out.println();
		
//		lastIndexOf("param") - Realiza uma busca apartir do final do string:
		System.out.println("lastIndexOf(\"param\")");
		System.out.println("|" + original + "|");
		System.out.println("|" + original.lastIndexOf("bc") + "|");
		System.out.println();
		
//		split(" ") - Divide o string com base em um separador, podendo ser um espaço ou outro caractere:
		System.out.println("split(\" \")");
		System.out.println("|" + original + "|");
		
		String[] palavras = original.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			
			if (i < palavras.length - 1) {
				System.out.print(palavras[i] + " | ");
			}
			else {
				System.out.println(palavras[i]);
			}
		}
		
	}

}
