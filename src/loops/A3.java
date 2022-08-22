package loops;

public class A3 {
//Length of no.of digits//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123456;
		int count=0;
		while(no!=0) {
			no=no/10;
			count++;
		}
		
		System.out.println("count is "+count);

	}

}
