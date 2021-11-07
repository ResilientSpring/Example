package Interface;

class ByTwos_instinct implements Series {
	
	int start = 0;
	int val = 0;

	@Override
	public int getNext() {
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

class ByThrees_instinct implements Series {
	
	int start = 0;
	int val = 0;

	@Override
	public int getNext() {
		val += 3;
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

public class SeriesDemo2_Interface_Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByTwos_instinct twos_instinct = new ByTwos_instinct();
		
		ByThrees_instinct threes_instinct = new ByThrees_instinct();
		
		Series refSeries;
		
		for (int i = 0; i < 5; i++) {
			refSeries = twos_instinct;
			
			System.out.println("Next ByTwos value is " + refSeries.getNext());
			
			refSeries = threes_instinct;
			
			System.out.println("Next ByThrees value is " + refSeries.getNext());
		}

	}

}
