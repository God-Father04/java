package demo;

public class Car {
	
	//variable-info
	   
	String name="City";
	String type="Sedan";
	String color="Silver";
	int engine=1500;
	int power=120;
	
	//Action/Behavior/Method
	public void spacious()   {
		System.out.println(name+" is comfertable "+ type);
		
	}
		public void powerfull() {
			System.out.println(name+" is "+engine+ "cc & its color is " +color);
		}	
		public void fast() {
			System.out.println(name + " is "+power+"hp & it is very Fast");
		}
	
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.spacious();
		Car a=new Car();
		a.fast();
		Car d=new Car();
		d.powerfull();
		
	
	}

}
