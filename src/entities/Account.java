package entities;

public class Account { // Conta.
	
//	Atributos:
	private int number; // Número.
	private String holder; //  titular.
	private double balance; // saldo. Atribuição de valor opcional.
	
	
//	Construtores:
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	
//	Método:
	// Número da conta:
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	// Titular da conta:
	public String holder() {
		return holder;
	}
	
	public void holder(String holder) {
		this.holder = holder;
	}

}
