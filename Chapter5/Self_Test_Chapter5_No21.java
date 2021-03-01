
class showBits4{
	
	int numbits;
	
	public showBits4(int n) {
		// TODO Auto-generated constructor stub
		
		numbits = n;
	}
	
	void show(long val) {
		
		long value = 1;
		
		var mask = value;
		
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

public class Self_Test_Chapter5_No21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showBits4 b = new showBits4(8);
		showBits4 i = new showBits4(32);
		showBits4 li = new showBits4(64);
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
