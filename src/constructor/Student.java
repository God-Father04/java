package constructor;

public class Student {
	String name;
	int id;
	char div;
	
	public Student(String s,int i,char c) {//Constructor//
		this.name=s;
		this.id=i;
		this.div=c;
	}
	public void m1() {
		System.out.println( name + id + div);
		
	}

	public static void main(String[] args) {

		Student s=new Student("Rahul", 100, 'A');
		s.m1();
	}

}
