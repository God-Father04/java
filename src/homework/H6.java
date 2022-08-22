package homework;
//given no.is perfect or not//
public class H6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int no=30;
	int sum=0;
	for (int i=1;i<no;i++){
		if(no%i==0) {
			sum=sum+1;
		}
	}
if (sum==no)
	System.out.println("Number is Perferct");
else
	System.out.println("Number is Not Perfect");
	}

}
