/* 
 * Methods with differing signatures are overloaded and not overridden.
 * */

class AAAAA {
	
	int i, j;
	
	AAAAA(int a, int b){
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class BBBBB extends AAAAA {
	
	int k;
	
	BBBBB(int a, int b, int c){
		super(a, b);
		
		k = c;
	}
	
	// overload show()
	void show(String msg) { // Because signatures differ, this show() simply overloads show() in superclass A.
		System.out.println(msg + k);
	}
}

public class Overide_v_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBBBB subBbbbb = new BBBBB(1, 2, 3);
		
		subBbbbb.show("This is K: ");  // This calls show() in B.
		subBbbbb.show();               // This calls show() in A.

	}

}
