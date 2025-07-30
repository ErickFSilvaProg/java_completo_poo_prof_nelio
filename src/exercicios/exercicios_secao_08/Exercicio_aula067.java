package exercicios.exercicios_secao_08;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio_aula067 {
	
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
		 */
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Variáveis:
		Product product = new Product();
		
//		Programa:
		System.out.println("Enter product data");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
//		Testando:
		System.out.printf("%s, %.2f, %d", product.name, product.price, product.quantity);
		
//		Fecha o Scanner:
		sc.close();
	}

}
