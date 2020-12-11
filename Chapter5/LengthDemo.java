// Use the length array member.
public class LengthDemo {

	public static void main(String[] args) {
		
		int list[] = new int[10];
		
		int TwoD_list[][] = new int[10][20];
		
		int[] nums = {1, 2, 3};
		
		int table [][] = {  // a variable-length table
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9}
				
		};
		
		/*
		 * 		int table [][] = {	{1, 2, 3},	{4, 5},	{6, 7, 8, 9} };
		 * 
		 * */
		
	//	int table2[][] = new int[3][5];   It is only after the the creation of a instance of two dimensional that table2 is linked with a real array. Textbook page 163.
	//	table2 = { {2, 4, 6, 8, 10}, {12, 14, 16, 18, 20}, {22, 24, 26. 28, 30}  };  // Arrays can be initialized when they are created. But in this case, this is a duplicate initialization for table2. Textbook page 165. 
		
	//	int table3[3][5] = { {2, 4, 6, 8, 10}, {12, 14, 16, 18, 20}, {22, 24, 26. 28, 30}  };
	//  Not a valid use of array reference variable. 	
		
	System.out.println("length of list is " + list.length);
	System.out.println("length of TwoD_list is " + TwoD_list.length);
	System.out.println("length of nums is " + nums.length);
	System.out.println("length of table is " + table.length);
	
	System.out.println("length of table[0] is " + table[0].length);
	System.out.println("length of table[1] is " + table[1].length);
	System.out.println("length of table[2] is " + table[2].length);
	
	System.out.println();
	
	// Use length to initialize "list"
	for (int i = 0; i < list.length; i++)    // Use length to control a for loop.
		list[i] = i*i;
	
	System.out.print("Here is list: ");
	
	// now use length to display list
	for (int i = 0; i < list.length; i++) 
		System.out.print(list[i] );
	System.out.println();

	}

}
