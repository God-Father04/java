package loops;

public class A2 {

	//reverse of given name//Aman Nimje
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String x="aman";
			String rev="";
			for(int i=x.length()-1;i>=0;i--) {
				rev=rev + x.charAt(i);
				
		}
	System.out.println("Reverse of given name. "+rev);
		}

	}
