package Constructors;

public class BankAccount {
	private long AccountNumber;
	private String AccountHolderName;
	private int Balance;
	public BankAccount(long accountNumber, String accountHolderName, int balance) {
		
		this.AccountNumber = accountNumber;
		this.AccountHolderName = accountHolderName;
		this.Balance = balance;
	}
	
	public BankAccount(long accountNumber, String accountHolderName) {
		this.AccountNumber = accountNumber;
		this.AccountHolderName = accountHolderName;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public int getBalance() {
		return Balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			Balance += amount;
			System.out.println("Deposit succesfully: " +Balance); 
		}
		else {
			System.out.println("Invalid deposit amount");
		}
		
	}
	public void Displaydetails() {
		System.out.println("AccountNumber: " + AccountNumber);
		System.out.println("AccountHolderName: " + AccountHolderName);
		System.out.println("Balance: " + Balance);
	}
}
