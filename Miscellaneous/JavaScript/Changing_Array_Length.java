package JavaScript;

public class Changing_Array_Length {

	public static void main(String[] args) {


		String[] students = {"Thomas", "Roger", "Amber", "Jennifer"};
		
		students.length = 2;
		
		for(int i = 0; i < students.length; i++)
			System.out.println(students[i]);

	}

}
