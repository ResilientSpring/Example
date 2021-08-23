
enum Tools{
	SCREWDRIVER(1), WRENCH(2), HAMMER(3), PLIERS(4);
	
	int catcher;

	Tools(int i) {
		catcher = i;
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Tools item : Tools.values()) {
			System.out.println("The No." + item.catcher + " tool is " + item);
		}

	}

}
