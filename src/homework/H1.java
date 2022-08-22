package homework;
//swap two no.//
public class H1 {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		
		System.out.println("value of a Before swap is "+a);
		System.out.println("value of b Before swap is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a After swap is "+a);
		System.out.println("value of b After swap is "+b);
		
		
	}
 
}