// Java syntax permits the name of a parameter or a local variable to be the same as the name of an instance variable.
// When this happens, the local name hides the instance variable.
// You can gain access to the hidden instance variable by referring to it through this.

public class Pwr4 {
	
	double b;
	int e;
	double val;
	
	public Pwr4(double b, int e) {
		
		this.b = b;
		this.e = e;
		
		this.val = 1;
		
		if(e == 0) return;
		for( ; e > 0 ; e--) this.val = this.val * b;
		
	}
	
	double get_pwr() {
		return this.val;
	}

}
