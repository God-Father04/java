package casting;
//Up Casting

public class C3 extends C2 {
	
	public void m3() {
		System.out.println("Good Morning");
	}

	public static void main(String[] args) {
		//Subclass reference & subclass object
		C3 ref=new C3();//object
		ref.m1();
		ref.m2();
		ref.m3();
		
		//Conversion of C3 type into C2
		//1st way
		C2 var=ref;
		var.m1();
		var.m2();
		//2nd way
		C2 obj=new C3();//object
		obj.m1();
		obj.m2();
		

	}

}
