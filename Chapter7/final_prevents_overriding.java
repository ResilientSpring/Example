class Apple {
	
	final void meth() {
		System.out.println("This is a final method.");
	}
}

class Whistle_blower extends Apple {
	
}


public class final_prevents_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whistle_blower informantBlower = new Whistle_blower();
		
		informantBlower.meth();

	}

}
