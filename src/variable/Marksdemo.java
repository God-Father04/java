package variable;

public class Marksdemo {
	 int engmarks;
	 int mathsmarks;
	 int phymarks;

	public static void main(String[] args) {
		
	Marksdemo ref1=new Marksdemo();
	
	ref1.engmarks= 50;
	ref1.mathsmarks= 60;
	ref1.phymarks= 70;
	System.out.println("first object marks " + ref1.engmarks  +ref1.mathsmarks  +ref1.phymarks);
	
	Marksdemo ref2=new Marksdemo();
	
	ref2.engmarks=70;
	ref2.mathsmarks=60;
	ref2.phymarks=50;
	System.out.println("second object marks "+ ref2.engmarks  + ref2.mathsmarks  +ref2.phymarks);
	
	
	
	
		// TODO Auto-generated method stub

	}

}
