// Print a conversion table of inches to meters.
// Display 12 feet of conversions, inch by inch. 
// Output a blank line every 12 inches. 
// One meter equals approximately 39.37 inches. 

/* 1 inch = feet =  meters;
 * 2 inches = feet = meters;
 * 3 inches = feet = meters;  
 * n inches = n feet = n meters;
 * 
 * 144 inches = 12 feet = meters;
 * */

/* 1 meter = 39.37 inches. 
 * 
 * (1/39.37) meter = 1 inch. 
 * */

/* 1 feet = 12 inches; 
 * 
 * (1/12) feet = 1 inch;
 * */

/* 1 inch = (1/12) feet = (1/39.37) meters;
 * 2 inches = 2 * (1/12) feet = 2 * (1/39.37) meters;
 * 3 inches = 3 * (1/12) feet = 3 * (1/39.37) meters;  
 * n inches = n * (1/12) feet = n * (1/39.37) meters;
 * 
 * 144 inches = 12 feet = 3.6576 meters;
 * */

public class Self_Test_chapter_1_number10 {

	public Self_Test_chapter_1_number10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float inch = 1;
		float feet = (float) ( inch/12 ); 
		float meter = (float) ( inch / 39.37 );
		
		System.out.println( inch + " inch is " + feet + " feets and " + meter + " meters.");
		
		int counter = 0;
		
		float conversion_coefficient= 0;
		
		float X=1;
		
		//  (1/12)X = 12;
				
		for (inch = 1 ; inch <= 12 ; inch ++) {
			
			
			if (inch == 1) {
				
				feet = (float) (1/12);  // 1 feet equals 12 inches;  1/12 feet equals 1 inch;
				
				System.out.println( inch + " inch equals " + feet + " feet and " + meter + " meters." );
				
			} else {
				
				feet = (float) (1/12);  // 1 feet equals 12 inches;  1/12 feet equals 1 inch;
				
				System.out.println( inch + " inches equal" + feet + " feet and " + meter + " meters.");
				
			}
			
			counter++;
			
			if(counter == 12) {
				
				System.out.println();
				
				counter = 0;
				
			}
						
		}

	}

}
