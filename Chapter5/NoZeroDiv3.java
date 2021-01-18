// Prevent a division by zero using the ?.
public class NoZeroDiv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = -5; i < 6 ; i++) 
			if (i != 0 ? true : false) 
				System.out.println("100 / " + i + " is " + 100 / i);

	}

}
