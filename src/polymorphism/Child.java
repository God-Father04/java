package polymorphism;//Runtime polymorphism//method Overriding

public class Child extends Parent{
	public void marry() {
		System.out.println("Marry to Kat");
		System.out.println("Love Marriage");
	}
	public static void marrry() {
		System.out.println("Marry to Isha");
		System.out.println("Love Marriage");
		
	}

	public static void main(String[] args) {
		Parent ref=new Child();
		ref.marry();
		

	}

}
