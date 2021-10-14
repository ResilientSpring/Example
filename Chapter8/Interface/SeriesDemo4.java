
package Interface;

// It is both permissible and common for classes that implement interfaces to define additional members of their own.
class Sniff_ByTwo implements Series {
	
	int value = 0;
	int start = 0;
	
	int previous = -2;
	
	public int getNext() {
		previous = value;		
		value += 2;
		
		return value;
	}
	
	public void reset() {
		value = 0;
		start = 0;
		previous = start - 2;
	}
	
	public void setStart(int x) {
		start = x;
		value = x;
		previous = x - 2;
	}
	
	// Add a method not defined by Series.
	int getPrevious() {
		return previous;
	}
}

public class SeriesDemo4 {
	
	public static void main(String[] args) {
		
				
		Sniff_ByTwo sniff_ByTwo = new Sniff_ByTwo();
		
		System.out.print(sniff_ByTwo.getPrevious());
		
		sniff_ByTwo.setStart(8);
		
		System.out.println("\n" + sniff_ByTwo.getPrevious());
	}

}
