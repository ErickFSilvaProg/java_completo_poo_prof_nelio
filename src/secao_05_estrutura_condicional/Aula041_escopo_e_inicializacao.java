package secao_05_estrutura_condicional;

public class Aula041_escopo_e_inicializacao {
	
	public static void main(String[] args) {
		
		/*
		 * - Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
		 * 
		 * Uma variável não pode ser usada se não for iniciada.
		 */
		
		
		double price = 400.00;
		double discount = 0;
		
		if (price < 200.00) {
			
			discount = price * 0.1;
		}
		
		System.out.println(price);
		System.out.println(discount);
		
	}

}
