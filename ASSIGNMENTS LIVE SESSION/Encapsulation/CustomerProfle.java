package Encapsulation;

public class CustomerProfle {

	private String name;
	public String getName() {
		System.out.print("Name:");
		return name;
	}
	public void setAge(int age) {
		
		if(age<18) {
			System.out.println("Age Eligibility has not met");
		}
		else
		{
			this.age=age;
		}
		
	}
	public String getAge() {
		
		return "Age:"+age;
	}
	public void setName(String name) {
		this.name=name;
	}
	private int age;
	
	
}
