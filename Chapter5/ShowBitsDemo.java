/* Try this 5-3
 *  
 * A class that displays the binary representation of a value. 
 *  
 * */
class ShowBits3{
	
	int numbits;
	
	public ShowBits3(int n) {
		// TODO Auto-generated constructor stub
		
		numbits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		// left-shift a 1 into the proper position
		mask <<= numbits-1;   // mask = mask << numbits-1;
		
		int spacer = 0;
		
		for (; mask != 0; mask  >>>= 1 ) {   // mask = mask >>> 1;
			
			if( (val & mask) != 0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if ((spacer & 8 ) == 0) {
				System.out.print(" ");
				spacer = 0;				
			}			
		}		
		System.out.println();
	}
}


// Demonstrate ShowBits3.
public class ShowBitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowBits3 b = new ShowBits3(8);
		ShowBits3 i = new ShowBits3(32);
		ShowBits3 li = new ShowBits3(64);
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
		// you can also show low-order bits of any integer
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);

	}

}
