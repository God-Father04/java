package practice;

public class V2 {
	
	int a=10;int b=2;

	public static void main(String[] args) {
		V2 x=new V2();
		x.substraction();
		x.divison();
		x.addition();
		x.mul();
//Non static method
	}
	public void substraction() {
		int d=a-b;
		System.out.println("sub "+d);
	}
	public void divison() {
		int c=a/b;
		System.out.println("div "+c);
	}
	public void addition() {
		int y=a+b;
		System.out.println("add "+y);
	}
	public void mul() {
		int m=a*b;
		System.out.println("mul "+m);
	}

}
