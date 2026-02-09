package secao_05_estrutura_condicional;

public class Aula048_escopoInicializacao {
	
	/*
	 * → Escopo e Inicialização:
	 * 
	 * 		• Escopo de uma variável: 
	 * 
	 * 			É a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
	 * 			Uma variável não pode ser usada se não for iniciada.
	 * 			(Falaremos de escopo de métodos no capítulo 5.)
	 * 
	 */
	
	public static void main(String[] args) {
		
		double price = 400.00;
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0.0;
		}
		
		System.out.println(discount);
		
	}

}
