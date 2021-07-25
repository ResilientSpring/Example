
class MyClass2{
	private static int alpha;
	public static int beta;
	static int gamma;
	
	static int delta = 1;
	
	public static void setAlpha(int alpha) {
		MyClass2.alpha = alpha;
	}
	
	public static int getAlpha() {
		return alpha;
	}
}

public class AccessDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyClass2.delta);
		System.out.println(MyClass2.beta);
		System.out.println(MyClass2.getAlpha());
//		System.out.println(MyClass2.alpha);

	}

}
