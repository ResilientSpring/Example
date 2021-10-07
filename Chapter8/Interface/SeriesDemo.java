package Interface;

class ByTwos implements Series {
	
	int start;
	int val;
	
	public ByTwos() {
		// TODO Auto-generated constructor stub
		start = 0;
		val = 0;
	}

	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		val = start;
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start = x;
		val = x;
	}
	
}

public class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByTwos obByTwos = new ByTwos();
		
		for (int i = 0; i < 5; i++) 
			System.out.println("Next value is " + obByTwos.getNext());
		
		System.out.println("\nResetting");
		obByTwos.reset();
		
		for (int i = 0; i < 5; i++) 
			System.out.println("Next value is " + obByTwos.getNext());
		
		System.out.println("\nStarting at 100");
		
		obByTwos.setStart(100);
		
		for (int i = 0; i < 5; i++)
			System.out.println("Next value is " + obByTwos.getNext());

	}

}
