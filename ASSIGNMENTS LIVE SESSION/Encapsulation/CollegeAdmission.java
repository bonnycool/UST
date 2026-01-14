package Encapsulation;

public class CollegeAdmission {

	public  String getGrade() {
		return Grade;
	}
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		
		 if(marks>=90)
	        {
	           this.Grade="A";
	        }

	        else if(marks>=75)
	        {
	        	 this.Grade="B";
	        }
	        else if(marks>=60)
	        {
	        	 this.Grade="C";
	        }
	        else{
	        	 this.Grade="F";
	        }
		this.marks = marks;
	}

	private float marks;
	private String Grade;
	
}
