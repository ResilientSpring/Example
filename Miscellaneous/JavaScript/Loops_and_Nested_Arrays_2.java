package JavaScript;

public class Loops_and_Nested_Arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] students = {{"Thomas", "92", "98"}, {"Roger", "87", "78"}, {"Amber", "81", "85"}, {"Jennifer", "99", "100"}}; 

		for (int i = 0; i < students.length; i++) {
			
			for (int j = 0; j < students[i].length; j++) {
				
				if (j == 0) {
					System.out.println(students[i][j] + ": ");
				}else if (j == students[i].length - 1) {
					System.out.println(students[i][j] + "\n");
				}
				
			}
			
		}
	}

}
