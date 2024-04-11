package JavaScript;

public class Assign_a_value_to_an_array_s_last_element {

	public static void main(String[] args) {
		
		String students[] = {"Thomas", "Roger", "Amber", "Jennifer"};
		
		students[0] = "Marty";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		students[students.length] = "Thomas";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
