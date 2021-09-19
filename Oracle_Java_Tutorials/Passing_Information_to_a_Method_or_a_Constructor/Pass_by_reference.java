package Passing_Information_to_a_Method_or_a_Constructor;

class Circle{
	
	public Circle(int x, int y) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Pass_by_reference {
	
	public static void moveCircle(Circle circle, int deltaX, int deltaY) {
	    // code to move origin of circle to x+deltaX, y+deltaY
	    circle.setX(circle.getX() + deltaX);
	    circle.setX(circle.getX() + deltaY);
	        
	    // code to assign a new reference to circle
	    circle = new Circle(0, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle myCircle = new Circle(1, 9);
		
		moveCircle(myCircle, 23, 56);
	}

}

// Reference: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
