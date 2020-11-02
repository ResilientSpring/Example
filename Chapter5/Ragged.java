// Manually allocate differing size second dimensions.

// Note that one dimensional array is arranged in "rows", not columns. See the textbook page on 164. 
// One dimensional array: type [row];
// Two dimensional array: type [column][row];

public class Ragged {

	public static void main(String[] args) {
		
		
		// An array that stores the number of passengers that ride an airport shuttle during a week.
		int riders [][] = new int [7][];
		
		riders[0] = new int[10];  // the shuttle runs 10 times a day during every weekday.
		riders[1] = new int[10];  // Tuesday.
		riders[2] = new int[10];  // Wednesday.
		riders[3] = new int[10];  // Thursday.
		riders[4] = new int[10];  // Friday.
		
		riders[5] = new int[2];  // the shuttle runs twice a day on Saturday and Sunday.
		riders[6] = new int[2];  // Sunday.
		
		// After finishing the skeleton of the table for recording, we start to collect the data into the table(array).
		
		int i, j;
		
		// fabricate some fake data.
		for(i = 0; i < 5; i++)
			for(j = 0 ; j < 10 ; j++)
				riders[i][j] = i + j + 10;
		
		System.out.println("Riders per trip during the workweek: "); 
		for(i = 0; i < 5 ; i++) {
			for(j = 0; j < 10; j++)
				System.out.print( riders[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		// fabricate some fake data.
		for(i = 5; i < 7 ; i++)
			for(j = 0; j < 2 ; j++)
				riders[i][j] = i + j + 10 ;
		
		System.out.println("Riders per trip on the weekend: ");
		for(i = 5; i < 7; i++) {
			for (j = 0; j < 2; j++) 
				System.out.print(riders[i][j] + " ");
			System.out.println();

		}

	}

}
