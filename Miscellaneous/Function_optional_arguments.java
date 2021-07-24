// Practicing the code from JavaScript A Beginner's Guide, page 95.
public class Function_optional_arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_alert(1200, "Corvette");
		
		check_alert(0, null);

	}
	
	public static void check_alert(int paycheck, String car) {
		System.out.println("You make $ " + paycheck + " and have a " + car);
	}

}
