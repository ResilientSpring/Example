package JavaScript;

public class Changing_Array_Length_2 {

	public static void main(String[] args) {
		
		String students[] = {"Thomas", "Roger", "Amber", "Jennifer"};
		
		students[6] = "Marty";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

}
