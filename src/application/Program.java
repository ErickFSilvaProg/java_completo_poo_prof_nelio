package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e qtd. no estoque).
		 * 
		 * Em seguida:
		 * 		
		 * 		Mostrar os dados do produto (nome, preço, qtd. no estoque, valor total no estoque);
		 * 		Realizar uma entrada no estoque e mostrar novamente os dados do produto;
		 * 		Realizar uma saída no estoque e mostrar novamente os dados do produto;
		 * 
		 * Para resolver este problema, você deve criar uma classe conforme projeto a baixo:
		 * 
		 * 		(Classe)
		 * 		Product
		 * 
		 * 		(Atributos)
		 * 		- name : String
		 * 		- price : double
		 * 		- quantity : int
		 * 
		 * 		(Métodos)
		 * 		+ totalValueInStock() : double
		 * 		+ addProducts(quantity : int) : void
		 * 		+ removeProducts(quantity : int) : void
		 * 
		 * 
		 * Toda classe em Java é uma subclasse da 'classe Object'.
		 * 
		 * Object possui os seguintes métodos:
		 * 
		 * 		getClass - retorna o tipo do objeto.
		 * 		equals - compara se o objeto é igual a outro.
		 * 		hashCode - retorna um código hash do objeto.
		 * 		toString - converte o objeto para string.
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
		
		product.setName("Celular");
		product.setPrice(1200.00);
		
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
