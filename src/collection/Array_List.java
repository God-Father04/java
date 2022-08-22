package collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Mumbai");
		al.add("Nashik");
		al.add("Tumsar");
		al.add("Kolhapur");
		
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.addAll(al);
		al1.add("Nagpur");
		al1.add("Bhandara");
		al1.add("Gondia");
		
		System.out.println(al1);

	}

}
