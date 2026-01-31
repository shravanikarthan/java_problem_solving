package ps;
//Calculate total marks and percentage for a student.
public class StudentResult {
	static double totalMarks=150;
	public static double calculateTotal(double m1,double m2,double m3) {
		return m1+m2+m3;
	}
	 static double calculatePercentage(double total) {
		return (total/totalMarks)*100;	 
		
	}
	
	public static void main(String[] args) {
	double m1=20;
	double m2=40;
     double m3=40;
	double  a=calculateTotal(m1,m2,m3);
		double b=calculatePercentage(a);
		
	
		System.out.println("total marks obtained:" + a);
		System.out.printf("percentage: %.2f%%\n", b);
	}

}
