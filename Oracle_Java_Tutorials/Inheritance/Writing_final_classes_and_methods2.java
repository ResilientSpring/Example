package Inheritance;

import Inheritance.ChessAlgorithm.ChessPlayer;

class ChessAlgorithm2 {
	
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

public class Writing_final_classes_and_methods2 {

	public static void main(String[] args) {
		
		ChessAlgorithm chessAlgorithm = new ChessAlgorithm();

	}

}
