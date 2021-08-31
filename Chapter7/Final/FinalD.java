package Final;

class W3school {
	final int x = 10;  // Set a variable to final, to prevent it from being modified:
}

public class FinalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		W3school myW3school = new W3school();
		
		myW3school.x = 25; // will generate an error: cannot assign a value to a final variable.
		
		System.out.println(myW3school.x);

	}

}

// Reference: https://web.archive.org/web/20210829102525/https://www.w3schools.com/java/ref_keyword_final.asp