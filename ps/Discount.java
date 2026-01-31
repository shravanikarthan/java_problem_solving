package ps;
//apply discount based on total purchase amount
public class Discount {
	double applyDiscount(double amount) {
		if (amount >= 3000)
			return amount * 10;//discount
		else
			return amount;	
	}
	public static void main(String[] args) {
		Discount d = new Discount();
		double finalAmount = d.applyDiscount(4000);
		System.out.println(finalAmount);
	}

}
