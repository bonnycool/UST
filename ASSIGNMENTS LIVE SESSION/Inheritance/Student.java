package Inheritance;

class person{
	String name;
	int age;
}

class stud extends person {
	int rollNo;
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stud s1=new stud();
		s1.name="Bonny";
		s1.age=22;
		s1.rollNo=48;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.rollNo);

	}

}
