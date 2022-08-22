package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {

	public static void main(String[] args) {
		//Arrays to List conversion

		String[] arr= {"Delhi","Mumbai","Chennai","Kolkata"};

		ArrayList<String> al=new ArrayList<String>();
		al.addAll(Arrays.asList(arr));
		al.add("Nagpur");
		al.add("Bhandara");
		System.out.println(al);
		System.out.println(al.size());
		
		//List to Arrays conversion
		
		String[] arr2=new String[al.size()];
		al.toArray(arr2);
		for(String s:arr2) {
			System.out.println(s);
		}


	}

}
