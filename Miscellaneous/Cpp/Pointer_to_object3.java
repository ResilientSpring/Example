package Cpp;

class P_example3{
	private int num;
	
	void set_num(int val) {
		num = val;
	}
	
	void show_num() {
		System.out.println(num);
	}
}

public class Pointer_to_object3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_example3 objective[] = {new P_example3(), new P_example3()};
		
		objective[0].set_num(10);
		objective[0].show_num();
		
		objective[1].set_num(20);
		objective[1].show_num();

	}

}
