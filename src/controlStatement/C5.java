package controlStatement;

public class C5 {
	//nested if-else//
       
	public static void main(String[] args) {
		int x=40;
		int y=50;
		int z=30;
	if (x>y) {
		if(x>z) 
			System.out.println("Largest no "+x);
		else 
			System.out.println("Largest no "+z);
		}
	
		else {
			if(y>z) 
				System.out.println("Largest no "+y);
			else
				System.out.println("Largest no "+z);
		}
	}
}    