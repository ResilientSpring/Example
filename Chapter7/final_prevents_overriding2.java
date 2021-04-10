
class Apple2 {
	final void meth() {
		System.out.println("This is a final method.");
	}
}

class Whistle_blower2 extends Apple2 {
	void meth(String eatString) {
		System.out.println(eatString + " ( Method overload is allowed in final. )");
	}
}

public class final_prevents_overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whistle_blower2 informantBlower2 = new Whistle_blower2();
		informantBlower2.meth("Method from Whistle blower2");
		
		informantBlower2.meth();

	}

}
