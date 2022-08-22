package programs;

//Separate char & no- from given String
public class R1 {

	public static void main(String[] args) {
		String s="virtualworld123456";
		String no="";
		String chars="";
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);//value store
			if(Character.isDigit(c)) {
				no=no+c;
			}
			else {
				chars=chars+c;
			}
		}
		System.out.println(s.length());
		System.out.println("Char from given String:- "+chars);
		System.out.println(chars.length());
		System.out.println("Digits from given String:- "+no);
		System.out.println(no.length());
	}}