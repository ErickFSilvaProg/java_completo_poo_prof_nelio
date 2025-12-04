package entities;

public class Rectangle {
	
//	Atributos:
	public double width;
	public double height;
	
	
//	Métodos:
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(this.width * this.width + this.height * this.height);
	}

}
