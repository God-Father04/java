package homework;
//given no.is prime or not//
public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=24;
		int y=0;
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				y=y+1;
			}
		}
       if (y>0)
    	   System.out.println(no+" Number is not Prime");
       else
    	   System.out.println(no+" It is Prime Number");
	}

}
