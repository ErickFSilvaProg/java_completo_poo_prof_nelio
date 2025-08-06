package entities;

public class Product {

//	Atributos:
	public String name;
	public double price;
	public int quantity;
	
	
//	Construtores: Sobrecarga.
	public Product() {
		// Construtor padrão.
	}
	
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	
//	Métodos:
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Sobrepondo a operação padrão 'toString()' da classe 'object':
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", this.price) 
				+ ", " 
				+ this.quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", this.totalValueInStock());
	}

}
