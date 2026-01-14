package object;

public class BookObj {

	String bookname;
	float bookprice;
	
	BookObj(){
		this.bookname="default";
		this.bookprice=1000;
		System.out.println("This is the default constructor");
	}
	
	BookObj(String bookname,float bookprice){
		this.bookname=bookname;
		this.bookprice=bookprice;
		
		System.out.println("Book name :"+bookname);
		System.out.println("Book price :"+bookprice);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookObj book1=new BookObj();
		BookObj book2=new BookObj("The Power Of The Subconsious Mind",2000);
		

	}

}
