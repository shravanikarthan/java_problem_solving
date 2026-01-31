package ps;
//Display the current balance of a bank account.
public class BankAccount {
	
    public void showBalance() 
    {
			int balance=10000;
	System.out.println("Current Balance:" + balance);
		}
		
		public static void main(String[] args) {
			BankAccount obj=new BankAccount();
			obj.showBalance();	
			
		}

	}

	