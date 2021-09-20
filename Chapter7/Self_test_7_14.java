
class A__{
	
}

class B__ extends A__{
	
	public A__ makeObj (int which) {
		if(which == 0)
			return new A__();
		else {
			return new B__();
		}
	}
}

public class Self_test_7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B__ aversionB__ = new B__();
		
		var myRef = (B__) aversionB__.makeObj(1);
		
		var check = myRef.makeObj(0);

	}

}
