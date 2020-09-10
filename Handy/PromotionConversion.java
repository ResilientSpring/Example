// Source: https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
public class PromotionConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int big = 1234567890;
        float approx = big;
        System.out.println(big - (int)approx);
	}

}
