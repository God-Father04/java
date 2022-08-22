package variable;

public class v1 {
	//instance type
	int x=30;
	

	public static void main(String[] args) {

		//object creation
		v1 ref=new v1();
		
		//utilization of variable
		System.out.println(ref.x);
		
		//Object creation
		v1 ref2=new v1();
		
		ref2.x=40;
		System.out.println(ref2.x);
		
		//////////////
		
        v1 ref3=new v1();
		
		ref3.x=50;
		System.out.println(ref3.x);
		
	

		v1 ref4=new v1();
		
		ref4.x=60;
		System.out.println(ref4.x);

	}

}
