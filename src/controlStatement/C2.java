package controlStatement;
//if else if//
public class C2 {

	public static void main(String[] args) {
		int percentage=90 ;
		if(percentage<35 && percentage>=0) {
			System.out.println("Fail");
		}
		else if(percentage>=35 && percentage<=50) {
			System.out.println("D grade");
		}
		else if(percentage>=51 && percentage<=60) {
			System.out.println("C grade");
		}
		else if(percentage>=61 && percentage<=75) {
			System.out.println("B grade");
		}
		else if(percentage>=76 && percentage<=85) {
			System.out.println("A grade");
		}
		else if(percentage>=86 && percentage<=100)  {
			System.out.println("A++");
		}
		else {
			System.out.println("Invalid Number");
		}
	}

}
