package polymorphism;
//Compile time Polymorphism//Method Overloading
public class P1 {
	public void m1() {
		System.out.println("m1 with no argument");
	}
	public void m1(int x) {
		System.out.println("m1 with int argument");
	}
	public void m1(String s) {
		System.out.println("m1 with string argument");
	}

	public static void main(String[] args) {
		P1 ref=new P1();
		ref.m1();
		ref.m1(10);
		ref.m1("string");

	}

}
