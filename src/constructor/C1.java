package constructor;

public class C1 {
	int x;
	public C1(int x) {
		this.x=x;
		System.out.println("C1-int type constructor");
	}

	public static void main(String[] args) {
		C1 ref=new C1(10);
		System.out.println(ref.x);

	}

}
