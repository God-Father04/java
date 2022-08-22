package encapsulation;

public class User {
	Account ac;
	public User() {
		ac=new Account();
	
	}
	
	public void getData(int input) {
		System.out.println(ac.getBal(input));
	}
	public void setData(double amt) {
		ac.setBal(amt);
	}

	public static void main(String[] args) {
		User ref=new User();
		ref.getData(10);
		ref.setData(5000);
		ref.getData(10);

		
	}

}
