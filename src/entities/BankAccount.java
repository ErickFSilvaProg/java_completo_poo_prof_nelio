package entities;

public class BankAccount { // Conta Bancária
	
//	Atributos:
	private int number; // Número
	private String holder; //  Titular
	private double balance; // Saldo
	
	
//	Construtores:
	public BankAccount() {
		// Construtor padrão
	}
	
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public BankAccount(int number, String holder, double initialDeposit) { // Depósito inicial
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
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
	
	// Saldo da conta:
	public double getBalance() {
		return balance;
	}
	
	// Depósito:
	public void deposit(double amount) { // Deposito | Quantia
		this.balance += amount;
	}
	
	// Saque:
	public void withdraw(double amount) { // Saque | Quantia
		this.balance -= amount + 5.0;
	}
	
	// toString:
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
