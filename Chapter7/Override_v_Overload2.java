
class Stratify {
	int i, j;
	
	Stratify(int a, int b){
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Optical_illusion extends Stratify {
	
	int k;
	
	Optical_illusion(int a, int b, int c){
		super(a, b);
		
		k = c;
	}
	
	// overload show()
	void show(String msg) { // Because signatures differ, this show() simply overloads show() in superclass A.
		System.out.println(msg + k);
	}
	
}

public class Override_v_Overload2 {
	
	public static void main(String[] args) {
		
		Stratify stratified_Stratify = new Stratify(2, 3);
		
		Optical_illusion illusion = new Optical_illusion(4, 5, 6);
		
		illusion.show(); // calling superclass' show()
		illusion.show("Method overloading lets you choose a version from a various methods with the same name.");
		
	}

}
