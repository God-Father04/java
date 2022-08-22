package string;

public class S3 {

	public static void main(String[] args) {
		String city1="Mumbai";
		String city2="Pune";
		String city3=new String("Mumbai");
		String city4=new String("Pune");
		String str="kaun be ka jhala";
		
		System.out.println(city1.equalsIgnoreCase(city3));
		
		System.out.println(city1.toUpperCase());
		
		System.out.println(city1.toLowerCase());
		
		System.out.println(city1.length());//Starts from 1
		
		System.out.println(city1.charAt(0));//Starts from 0
		
		System.out.println(city1.contains(city3));
		
	
		

	}

}
