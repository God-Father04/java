package homework;
//Reverse  the given no.//

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no=12345;
         int reminder=0;
         int reverseNo=0;
         
         while(no!=0) {
        	 reminder=no%10;
        	 reverseNo=reverseNo*10+reminder;
        	 no=no/10;
         }
         System.out.println("Reverse= "+reverseNo);
	}

}
