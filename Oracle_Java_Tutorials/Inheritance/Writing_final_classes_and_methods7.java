package Inheritance;

import Inheritance.ChessAlgorithm___.ChessPlayer;

class ChessAlgorithm___{
	enum ChessPlayer{
		BLACK, WHITE
	}
	
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.BLACK;
	}
}

public class Writing_final_classes_and_methods7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessAlgorithm___ returnType = new ChessAlgorithm___();
		
		ChessPlayer symposiumChessPlayer =  returnType.getFirstPlayer();
		
		System.out.println(symposiumChessPlayer);

	}

}
