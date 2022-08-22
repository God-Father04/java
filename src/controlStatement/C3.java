package controlStatement;

public class C3 {
	//if-else if//

	public static void main(String[] args) {
		int x=100;
		int y=30;
		int z=90;
		int a=200;
	if(x>y && x>z && x>a) 
		System.out.println("Largest no = " +x);
	
	else if(y>x && y>z && y>a ) 
		System.out.println("Largest no = "+y);
	
	else if (a>x && a>y && a>z) 
		System.out.println("Largest no = "+a);
	
	else 
		System.out.println("Largest no = "+z);
	}
	}
	


