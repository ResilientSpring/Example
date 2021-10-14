package Interface;

// If a class includes an interface but does not fully implement the methods defined by that interface, then that class 
// must be declared as abstract.
abstract class mouthpiece implements Series {
	
	public void reset() {
		
	}
	
	public void setStart() {
		
	}
}

// The subclasses of the abstract class can provide the remaining implementations.
class Redress extends mouthpiece {
	
	int current = 0;
	int next = 0;
	
	public int getNext() {
		next = current + 1;
		
		return next;
	}
	
	// The type signature of the implementing method must match exactly the type signature specified in the interface.
	public void setStart(int x) {
		current = x;
	}
}

public class Partial_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Redress redress = new Redress();
		
		redress.setStart(5);
		
		System.out.println(redress.getNext());

	}

}
