package polymorphism;//compile time polymorphism//static method

public class P2 {
	public P2() {
		this("a");
		System.out.println("No argument Constructor");
	}
	public P2(String a) {
		System.out.println("Int argument Constructor");
	}
	public static void m1() {
		System.out.println("m1 with no argument");
	}
	public static void m1(int x) {
		System.out.println("m1 with int argument");
	}
	public static void m1(String s) {
		System.out.println("m1 with string argument");
	}

	public static void main(String[] args) {
		P2 ref=new P2();
	
		m1();
		m1(10);
		m1("string");
		

	}

}
