package inheritance;

public class Child2 extends Parent {//Hierarchical Inheritance
	public void m2() {
		System.out.println("Child2 m2");
	}
	public static void main(String[] args) {
		Child2 ref=new Child2();
		ref.land();
		ref.cash();
		ref.m2();
		ref.Assets();
	

	}

}
