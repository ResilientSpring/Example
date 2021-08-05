// Use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses.

// You might wish to make a method final if it has an implementation that should not be changed and 
// it is critical to the consistent state of the object. 

// For example, you might want to make the getFirstPlayer method in this ChessAlgorithm class final:
class ChessAlgorithm{
	enum ChessPlayer {WHITE, BLACK}
	
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

public class Final_classes_or_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
