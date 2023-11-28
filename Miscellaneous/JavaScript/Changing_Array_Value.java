package JavaScript;

public class Changing_Array_Value {

	public static void main(String[] args) {

		String[] students = { "Thomas", "Roger", "Amber", "Jennifer" };

		for (int i = 0; i < students.length; i++)
			students[i] += " Doe";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

}
