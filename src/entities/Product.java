package entities;

public class Product {

//	Atributos:
	private String name;
	private double price;
	private int quantity;
	
	
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
	
	
//	Getters and Setters:
	// name:
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// price:
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// quantity:
	public int getQuantity() {
		return this.quantity;
	}
	
	
//	Métodos:
	public double totalValueInStock() {
		return this.price * this.quantity;
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
