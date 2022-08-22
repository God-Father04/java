package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorrrr {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Tumsar");
		al.add("Bhandara");
		al.add("Gondia");
		al.add("Nagpur");
		
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()){
			String value=itr.next();
			System.out.println(value);
			
			if(value.equals("Tumsar")) {
				itr.remove();
			}
		}
		System.out.println(al);


}

}
