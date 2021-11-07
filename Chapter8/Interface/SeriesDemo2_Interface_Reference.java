package Interface;

class ByTwos_instinct implements Series {
	
	int start = 0;
	int val = 0;

	@Override
	public int getNext() {
		val += 2; 
		
		return 0;
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

class ByThrees_instinct {
	
}

public class SeriesDemo2_Interface_Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
