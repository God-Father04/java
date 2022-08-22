package string;

public class S1{

	public static void main(String[] args) {
		String city1="Mumbai";
		String city2="bai";
		String city3=new String("Mumbai");
		String city4=new String("Pune");
		
		System.out.println(city2.equals(city4));
		System.out.println(city1.contains(city2));
		
		int count=city1.length();
		
		System.out.println(count);
		
		System.out.println(city3.charAt(1));
		
		//equals used for content comparison
	}

}
