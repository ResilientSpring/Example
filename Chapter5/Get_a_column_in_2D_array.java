
public class Get_a_column_in_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double data[][] = {
				{2000, 1.5},
				{2001, 1.7},
				{2002, 3.6},
				{2001, 2.4},
				{2002, 2.9},
				{2003, 3.2}
		};
		
		// Accessing the first column.
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i][0]);
		}
		
		// Accessing the second column.
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i][1]);
		}

	}

}
