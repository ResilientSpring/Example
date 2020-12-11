// Prevent a division by zero using the ?.
public class Question_Mark_Form_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result; 
		
		for(int i = -5; i < 6 ; i++) {
			
			result = i != 0 ? 100/i : 0 ;
			
			if (i != 0) System.out.println("100 / " + i + " is " + result);
			
		}
			

	}

}
