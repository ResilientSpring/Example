package Cpp;

class P_example {
	private int num;
	
	void set_num(int val) {
		num = val;
	}
	
	void show_num() {
		System.out.println(num);
	}
}

public class Pointer_to_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_example objectives[] = new P_example[2];
		objectives[0].set_num(10);
		objectives[1].set_num(20);
		
		objectives[0].show_num();

	}

}
