
public class Question_Mark_Form_if_else2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result;
		
		for (int i = -5; i < 6; i++) {
			result = i != 0 ? 100/i : 0;
			
			if (i != 0 ? true : false ) {
				System.out.println("100 / " + i + " is " + 100/i);
			}
		}

	}

}
