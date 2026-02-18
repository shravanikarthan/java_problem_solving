package Constructors;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount(1234567890l,"shalini",80000);
		obj. Displaydetails();
		BankAccount obj1=new BankAccount(1234567890l,"shalini");
		obj1.Displaydetails();
		obj.deposit(2000);

	}

}
