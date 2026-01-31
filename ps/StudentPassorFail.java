package ps;
//Check if a student passes (marks ≥ 35).
public class StudentPassorFail {
	static boolean isPass(int marks) {
		return marks >= 35;
	}
		
		
	

	public static void main(String[] args) {
		int marks = 42;
		
		if (isPass(marks)) {
			System.out.println("student passed");
		}
			else {
			System.out.println("student failed");
		}
		
	}

}
