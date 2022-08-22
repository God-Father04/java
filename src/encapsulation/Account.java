package encapsulation;

public class Account {
	
	
	private double accBal=1234.34;
	
	public  double getBal(int AccNo) {
		return this.accBal;

	

	}
	public void setBal(double amt) {
		this.accBal=accBal+amt;
	}

}
