package constructor;

public class C3 {
	public C3() {
		this("Hello");
		System.out.println("C3-No arg type Constructor");
	}
	public C3(int x) {
		System.out.println("C3-int type Constructor");
	}
	public C3(String s) {
		this(10);
		System.out.println("C3-String type Constructor");
	}

	public static void main(String[] args) {
		C3 ref=new C3();

	}

}
