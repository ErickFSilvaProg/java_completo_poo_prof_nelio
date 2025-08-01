package util;

public class Calculator {
	
//	Constante: Membro estático.
	public final double PI = 3.14159;
	
	
//	Métodos estáticos:
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
