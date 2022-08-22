package loops;

public class A5 {

	public static void main(String[] args) {
		int no=12345;
		int reverse=0;
		int remainder;
		
		while(no!=0) {
			remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
		}

		System.out.println("Reverse no is - "+reverse);
	}

}
