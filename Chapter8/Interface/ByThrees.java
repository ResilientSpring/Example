package Interface;

public class ByThrees implements Series {
	
	int start;
	int val;
	
	public ByThrees() {
		// TODO Auto-generated constructor stub
		start = 0;
		val = 0;
	}

	@Override
	public int getNext() {
		// TODO Auto-generated method stub
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
