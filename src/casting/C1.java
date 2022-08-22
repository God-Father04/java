package casting;

public class C1 {

	public static void main(String[] args) {
		//Implicit casting
		//1
		int i=20;
		long l=i;
		System.out.println(l);
		//2
		byte b=10;
		int j=b;
		System.out.println(j);
		
		//Explicit Casting
		long g=15;
		int k=(int)g;
		System.out.println(k);
		//2
		double d=1234.45;
		int m=(int)d;
		System.out.println(m);

	}

}
