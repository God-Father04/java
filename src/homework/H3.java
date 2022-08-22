package homework;
//Count the length of the no.//
public class H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=12345672;
		int length=0;
		while(no!=0) {
			no=no/10;
			length=length+1;
		}
		System.out.println("Length= "+length);

	}

}
