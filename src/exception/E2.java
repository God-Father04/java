package exception;

public class E2 extends E1 {
	public void m2() {
		System.out.println("M2 of E2");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			System.out.println(10/0);
			
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
			System.out.println(e.getClass());
			e.printStackTrace();//Trace
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Main End");

	}

}
