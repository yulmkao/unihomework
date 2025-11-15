package Homework9;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;

	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
	}

	public BankAccount() {
		this("unknown number", "unknown name", 0.0, "unknown currency", false);
	}

	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 0.0, "unknown currency", false);
	}

	public void displayInfo() {
		System.out.println("лицевой счет под номером: " + accountNumber + ", зарегестрированный на имя " + ownerName);
		System.out.println("баланс: " + balance);
		System.out.println("валюта счета: " + currency);
		System.out.println("активен ли счет? " + isActive);
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("теперь на счету: " + balance);
	}

	public void withdraw(double amount) {
	    if (balance < amount) {
	        System.out.println("недостаточно средств на счету");
	    } else {
	        balance -= amount;
	        System.out.println("теперь на счету: " + balance);
	    }
	}

	public void activateAccount() {
		isActive = true;
		System.out.println("теперь счет активен");
	}

	public void deactivateAccount() {
		isActive = false;
		System.out.println("счет был заблокирован");
	}
}