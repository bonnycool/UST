package object;

public class LibraryObj {
	
	int bookId;
	String title;
	String author;
	
	LibraryObj(){
		this.bookId=1;
		this.title="THE ART OF BEING ALONE";
		this.author="RITHVIK SINGH";
		
	}
	
	boolean isAvailable(String title)  {
		if(title.equals(this.title))
		{
		return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryObj lib1=new LibraryObj();
		
		if(lib1.isAvailable("THE ART")) {
			System.out.println("Book available");
		}
		else {
			System.out.println("Book not available");
		}
		

	}

}
