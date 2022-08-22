package method;

public class M3 {
	static int x=20;
    static int y=5;
	
	public static int sum(int x, int y)
	{
		int sum=x+y;
		
		return sum;
		}
	
	public static int sub(int x, int y)

	{
        int sub=x-y;
        
		return sub;
		}
		public static void main(String[] args) {
	
	
		System.out.println("sum = "+sum(x,y));
		System.out.println("sub = "+sub(x,y));
	
		
		}

}
