package Encapsulation;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSalary Emp1=new EmployeeSalary();
		
		Emp1.setEmpid(1);
		Emp1.setSalary(-12);
		
		System.out.println("Employee id ="+Emp1.getEmpid());
		
		
		
		 Emp1.displaySalary();
		
		
		

	}

}
