package Encapsulation;

public class EmployeeSalary {
	
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		
		if(salary<0)
		{
			this.salary=8000f;
		}
		else {
		this.salary = salary;
		}
		
		}
	private float salary;
	
	public  void displaySalary() {
		
		System.out.println("salary ="+this.salary);
		
		
	}
	

}
