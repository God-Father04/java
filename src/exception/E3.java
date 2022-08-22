package exception;

public class E3 {
	public void m1() {
		System.out.println("M1 of E3");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			System.out.println(e.getClass());
		}
		catch(ClassCastException e) {
			System.out.println(e.getClass());
		}
		catch(RuntimeException e) {
			System.out.println(e.getClass());
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
