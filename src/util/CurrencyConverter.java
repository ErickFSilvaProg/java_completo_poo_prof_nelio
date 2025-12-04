package util;

public class CurrencyConverter { // Conversor de moeda
	
//	Atributos:
	public static double IOF = 1.1;
	
//	Métodos:             dólarReal         quantia        preço do dólar
	public static double dollarReal(double amount, double dollarPrice) {
		
		return amount * dollarPrice * (1.0 + IOF);
	}

}
