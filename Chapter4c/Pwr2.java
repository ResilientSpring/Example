
public class Pwr2 {
	
	double b ;
	int e; 
	double val; 
	
	public Pwr2(double base, int exp) {
		this.b = base;
		this.e = exp;
		
		this.val = 1;
		if(exp == 0) return;
		for( ; exp > 0 ; exp--) this.val = this.val * base;
	}
	
	double get_pwr() {
		return this.val;
	}

}
