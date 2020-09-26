// Another example of using break with a label.
public class Break5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The block being labeled can be a stand-alone block, or a statement that has a block as its target.
		// Here, for, which is being labeled, is a statement that has a block as its target. See the textbook page 121.
		done:  
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						System.out.println(k + " ");
						if (k == 5) break done; // jump to done
						
					}
					
					System.out.println("After k loop"); // won't execute
					
				}
				
				System.out.println("After j loop"); // won't execute
				
			}
	
	System.out.println("After i loop");

	}

}
