package object;

public class Employeeobj {
	
	int empid;
	String empname;
	float empsal;
	
	Employeeobj(){
		this.empid=1;
		this.empname="Default";
		this.empsal=8000;
	}
	
	void DisplayEmployeDetails(){
		
		System.out.println("Emp id ="+empid);
		System.out.println("EmpName ="+empname);
		System.out.println("Emp Salary="+empsal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeeobj emp1=new Employeeobj();
		
		emp1.DisplayEmployeDetails();
		

	}

}
