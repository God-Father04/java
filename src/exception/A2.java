package exception;

public class A2 {
	public static void login(String username,String pass) {
		if(username.equals("admin123")) {
			if(pass.equals("123")) {
				System.out.println("Successfully Login");
			}
			else {
				throw new ArithmeticException("Invalid Password");
			}
		}
			else {
				throw new ArithmeticException("Invalid Username");
			}
		}
	public static void main(String[] args) {
		login ("admin123","123");

	}

}
