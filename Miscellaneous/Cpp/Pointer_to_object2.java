package Cpp;

class P_example2{
	private int num;
	
	void set_num(int val) {
		num = val;
	}
	
	void show_num() {
		System.out.println(num);
	}
}

public class Pointer_to_object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_of_integer = new int[5];
		
		P_example2[] objectives = new P_example2[2];
		
		objectives[0] = new P_example2();
		objectives[0].set_num(10);
		objectives[0].show_num();

	}

}
