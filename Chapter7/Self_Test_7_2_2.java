
class geriatric{
	int a = 2;
	static int b = 5;
	
	static int exploitation (){
		return b * 6;
	}
}

class slippery_slope extends geriatric{
	int c = a * b;
	
}


public class Self_Test_7_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		slippery_slope slope = new slippery_slope();
		
		System.out.println(slope.c);

	}

}
