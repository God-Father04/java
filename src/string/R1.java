package string;
//Reverse String + Pallindrome
public class R1 {

	public static void main(String[] args) {
		String s="hello";
	
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s.length());
		
		if(s.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}
	
	}


