package secao_09_construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Aula078_sobrecarga {
	
	public static void main(String[] args) {
		
		/*
		 * # Sobrecarga:
		 * 
		 * 	- É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
		 * 
		 */ 
		
		/*
		 * Vamos criar um construtor opcional, o qual recebe apenas 'nome' e 'preço' do produto.
		 * A 'quantidade' em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero.
		 * 
		 * Nota: é também incluir um construtor padrão.
		 * 
		 */
		
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//		Variáveis:
		Product product;
		String name;
		double price;
		int quantity;
		
		
//		Programa:
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Price: ");
		price = sc.nextDouble();
		
		product = new Product(name, price);
		
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
