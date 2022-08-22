package exception;

public class E1 {
	public void m1() {
		System.out.println("M1 of E1");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {//if exception occurs
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
