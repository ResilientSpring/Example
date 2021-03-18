
public class Pwr3 {
	
	double b, val;
	int e;
	
	public Pwr3(double b, int e) {
		this.b = b;
		this.e = e;
		
		val = 1;
		if (e==0) return;
		for( ; e>0 ; e--) val = val * b;
	}

}
