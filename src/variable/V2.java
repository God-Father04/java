package variable;

public class V2 {
   static int x=40;
    
	public static void main(String[] args) {
		
		V2 ref=new V2();
		System.out.println(ref.x);
		
		x=50;
		System.out.println("After value update");
		System.out.println(x);
				
        //local variable
		int l=30;
		
		System.out.println(l);

		
		// TODO Auto-generated method stub

	}

}
