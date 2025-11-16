package Classwork10;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	public static int totalAccounts = 0;
	public static final String BANK_NAME = "Национальный Банк";

	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
		totalAccounts++;
	}

	public BankAccount() {
		this("unknown number", "unknown name", 0.0, "unknown currency", false);
	}

	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 0.0, "unknown currency", false);
	}

	public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
    	return balance;
    }

    public void setBalance(double balance) {
    	if (balance >= 0 && balance <= 1000000000) {
    		this.balance = balance;
    	} else {
    		System.out.println("такое нельзя");
    	}
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean getIsActive() {
    	return isActive;
    }

    public void setIsActive(boolean isActive) {
    	this.isActive = isActive;
    }

    public static int getTotalAccounts() { 
        return totalAccounts;
    }

    public static double calculateInterest(double amount, double rate, int years) {
    	double multiplier = 1 + rate / 100;
    	double result = amount;
	    for (int i = 0; i < years; i++) {
	        result *= multiplier;
	    }
    	return result;
	}

	public void displayInfo() {
		System.out.println("банк: " + BANK_NAME); 
		System.out.println("лицевой счет под номером: " + accountNumber + ", зарегистрированный на имя " + ownerName);
		System.out.println("баланс: " + balance);
		System.out.println("валюта счета: " + currency);
		System.out.println("активен ли счет? " + isActive);
		System.out.println("всего счетов в банке: " + totalAccounts);
	}

	public void displayInfo(boolean showStatus) {
		if (showStatus == true) {
			displayInfo();
		} else {
			System.out.println("банк: " + BANK_NAME); 
			System.out.println("лицевой счет под номером: " + accountNumber + ", зарегистрированный на имя " + ownerName);
			System.out.println("баланс: " + balance);
			System.out.println("валюта счета: " + currency);
			System.out.println("всего счетов в банке: " + totalAccounts);
		}
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("теперь на счету: " + balance);
	}

	public void deposit(double amount, String description) {
	    deposit(amount);
	    System.out.println("подробная информация: " + description);
	}

	public void withdraw(double amount) {
	    if (balance < amount) {
	        System.out.println("недостаточно средств на счету");
	    } else {
	        balance -= amount;
	        System.out.println("теперь на счету: " + balance);
	    }
	}

	public void withdraw(double amount, String purpose) {
	    withdraw(amount);
	    System.out.println("цель снятия: " + purpose);
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