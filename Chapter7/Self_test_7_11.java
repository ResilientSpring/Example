class A_{

}

class B_ extends A_{
	
	public B_() {
		// TODO Auto-generated constructor stub
	}
	
	public A_ make_ob(int which) {
		// TODO Auto-generated method stub
		if (which == 0)
			return new A_();
		else 
			return new B_();
	}
}

public class Self_test_7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B_ aversionB_ = new B_();
		
		var myRef = aversionB_.make_ob(1);

	}

}
