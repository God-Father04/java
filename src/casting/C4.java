package casting;
//Down Casting----Compiletime error
public class C4 extends C1 {
          public void m2() {
			System.out.println("m2 of c2");
		}
		
		public static void main(String[] args) {
			
			//Subclass reference & subclass object
			C1 ref=new C1();
			
		//	ref.m1();
			
		
			
			//conversion of C2 type into C1
			//1- way
		//	C2 ref1=(C2)ref;//runtime error
			
			
			//2 way- upcasting
		//	C2 ref3=new C1();//--Compile time error
			

		}

	

	}


