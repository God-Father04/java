package method;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
  System.out.println("Enter the ProdCode: ");
           String pCode=s.nextLine();
  System.out.println("Enter the ProdName: ");
           String pName=s.nextLine();
  System.out.println("Enter the ProdPrice: ");
           float pPrice=s.nextFloat();
  System.out.println("Enter the ProdQty: ");
            int pQty=s.nextInt();
      System.out.println("====ProdDetails====");
      System.out.println("ProdCode: "+pCode);
      System.out.println("ProdName: "+pName);
      System.out.println("ProdPrice: "+pPrice);
      System.out.println("ProdQty: "+pQty);
	}

}
