
class Apple3 {
	final void meth () {
		System.out.println("This is a final method.");
	}
}

class Whistle_blower3 extends Apple3 {
	void meth() {
		System.out.println("Attempting to override the meth() preceded by final, in the superclass");
	}
}

public class final_prevents_overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whistle_blower3 informantBlower3 = new Whistle_blower3();
		
		informantBlower3.meth();

	}

}
