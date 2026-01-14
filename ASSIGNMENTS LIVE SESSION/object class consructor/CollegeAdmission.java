package object;

public class CollegeAdmission {
	
	String admissionType;
	
	
	CollegeAdmission(){
		this.admissionType="General";
		
	}
	CollegeAdmission(String admissionType){
		this.admissionType=admissionType;
	}
	
	void display(String student){
		System.out.println("Name of the Student:"+student);
		System.out.println("Admission Type:"+this.admissionType);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollegeAdmission clg1=new CollegeAdmission();
		clg1.display("Raj");
		
		CollegeAdmission clg2=new CollegeAdmission("Merit");
		clg2.display("Suhail");
		
		

	}

}
