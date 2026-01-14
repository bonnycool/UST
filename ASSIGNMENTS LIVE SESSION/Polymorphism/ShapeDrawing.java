package Polymorphism;

	class shape {
		
		void draw(String shape) {
			System.out.println("Drawing the shap "+shape);
		}
	}
	
	class rectangle extends shape{
		@Override
		void draw(String shape) {
			System.out.println("Overriding success");
		}
	}
	
	class circle extends shape{
		@Override
		void draw(String shape) {
			System.out.println("trying to draw a circle ");
		}
	}
	
	
public class ShapeDrawing {
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj1=new rectangle();
		obj1.draw("Rectangle");
		shape obj2=new circle();
		obj2.draw("Circle");
		
		circle obj3=new circle();
		obj3.draw("Testing overriding");
		
		

	}

}

