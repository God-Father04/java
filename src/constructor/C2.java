package constructor;

public class C2 {

	 public C2() {
    	this(0);
    	System.out.println("C1-No arg type Constructor");
    }
	 public C2(int x) {
		 System.out.println("C1-int type Constructor");
	}
	 public static void main(String[] args) {
		 C2 ref=new C2();
	 }

}
