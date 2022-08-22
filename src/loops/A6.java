package loops;//While loop

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the no -");
		int  b=a.nextInt();
		int no=123435;
		int count=0;
		
		while(no!=0) {
			no=no/10;
			count++;
		}
		System.out.print("Length of digits - "+count);}
	

	}


