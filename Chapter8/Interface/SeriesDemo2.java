package Interface;

class ByTwo2 implements Series {
	
	int start = 0;
	int val = 0;
	
	public ByTwo2() {
		// TODO Auto-generated constructor stub
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

public class SeriesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByTwo2 obByTwos = new ByTwo2();
		
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
