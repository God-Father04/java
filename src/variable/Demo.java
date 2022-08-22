package variable;

public class Demo {
	int a=10;//Instance variable
	static int b=20;//Static variable

	public static void main(String[] args) {
		int c=30;//local variable
		Demo ref=new Demo();
		
		System.out.println("a:"+ref.a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);

	}

}
