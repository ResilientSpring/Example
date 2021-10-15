package Interface;

public class ByTwo implements Series {
	
	int start;
	int val;
	
	public int getNext() {
		val += 2;
		return val;
	}
	
	public void reset() {
		
	}
	
	public void setStart(int x) {
		
	}

}
