package variable;

public class S1 {	
	
	public static int sum(int z,int y) {
		int sum=z+y;
			return sum;
}
		public static int sub(int z,int y) {
		int sub=z-y;
		return sub;
			}
		public static int mul(int z,int y) {
		int mul=sum (z,y)*sub(z,y);
		return mul;
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 ref=new S1();
	
	
		System.out.println(ref.mul(1,5));

	}
}