package exception;


public class A1 {
	public void m1() {
		System.out.println("M1 of A1");
	}

	public static void main(String[] args) throws InterruptedException {
		
		 Thread.sleep(2000);
		System.out.println("Afteerr Catch");

	}

}
