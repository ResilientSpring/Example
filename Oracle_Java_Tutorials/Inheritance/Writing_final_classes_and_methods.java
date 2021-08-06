/**Source: https://docs.oracle.com/javase/tutorial/java/IandI/final.html
 * 
 * Use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses.
 * 
 * You might wish to make a method final if it has an implementation that should not be changed 
 * and it is critical to the consistent state of the object. 
 */
package Inheritance;

class ChessAlgorithm {
	
	// An enumeration is a list of named constants that define a new data type. 
	enum ChessPlayer {
		White,
		Black
	}
	
	// For example, you might want to make the getFirstPlayer method in this ChessAlgorithm class final.
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.White;
	}
}

class Chess extends ChessAlgorithm {
	
	ChessPlayer getFirstPlayer() {
		

	}
}

public class Writing_final_classes_and_methods {

	public static void main(String[] args) {
		
		ChessAlgorithm chessAlgorithm = new ChessAlgorithm();
		
		chessAlgorithm.getFirstPlayer();

	}

}
