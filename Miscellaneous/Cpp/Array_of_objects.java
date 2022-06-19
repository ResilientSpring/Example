package Cpp;

class MyClass{
	private int x;
	
	void set_x(int i) {
		x = i;
	}
	
	int get_x() {
		return x;
	}
}

public class Array_of_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_name = new int[4];
		
		int j;
		
		for (j = 0; j < array_name.length; j++) 
			array_name[j] = j;
		
		for (j = 0; j < array_name.length; j++) 
			System.out.println("array_name[" + j + "]'s value: " + array_name[j] + "\n");
		
		
		MyClass[] objects = new MyClass[4];
		
		int i;
		
		for (i = 0; i < objects.length; i++) 
			objects[i].set_x(i);
		
		for (i = 0; i < objects.length; i++) 
			System.out.println("Objects[" + i + "].get_x(): " + objects[i].get_x());

	}

}
