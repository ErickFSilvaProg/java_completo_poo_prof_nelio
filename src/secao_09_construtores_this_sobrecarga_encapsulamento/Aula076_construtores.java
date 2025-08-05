package secao_09_construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Aula076_construtores {
	
	public static void main(String[] args) {
		
		/*
		 * # Construtor:
		 * 
		 * 	- É uma operação especial da classe, que é executada no momento da instanciação do objeto.
		 * 
		 * 	- Usos comuns:
		 * 
		 * 		Iniciar valores dos atributos.
		 * 		Permitir ou obrigar que o objeto receba dados/dependências no momento de sua instanciação. (Injeção de dependência)
		 * 
		 * 	- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
		 * 
		 *                    ->         <-
		 * 		Product p = new Product();
		 * 
		 * 	- É possível especificar mais de um construtor na mesma classe. (Sobrecarga)
		 */
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//		Variáveis:
		String name;
		double price;
		int quantity;
		
		
//		Programa:
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Price: ");
		price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.print("Product data: " + product);
		
		System.out.println("\n");
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.print("Updated data: " + product);
		
		System.out.println("\n");
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.print("Updated data: " + product);
		
		
//		Fecha o Scanner:
		sc.close();
		
	}

}
