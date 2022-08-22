package inheritance;//Is type

public class Child extends Parent {//Is type
	public void gold() {
		System.out.println("Child Gold");
	}

	public static void main(String[] args) {//Multilevel Inheritance
		Child c=new Child();
		c.land();//Parent
		c.cash();//Parent
		c.gold();//Child
		c.Assets();//GrandParent
	

	}

}
