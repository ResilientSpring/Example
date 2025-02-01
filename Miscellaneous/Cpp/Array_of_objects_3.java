package Cpp;

class MyClasses{
	private int x;
	
	void set_x(int i) {
		x = i;
	}
	
	int get_x() {
		return x;
	}
}

public class Array_of_objects_3 {

	public static void main(String[] args) {
		
		
		MyClasses[] objects = new MyClasses[4];
		
		objects[0] = new MyClasses();
		objects[0].set_x(11);
		
		objects[1].set_x(22);
		objects[2].set_x(33);
		
		
//		for (int i = 0; i < objects.length; i++) 
//			objects[i].set_x(i);
		
		for (int i = 0; i < objects.length; i++) 
			System.out.println("Objects[" + i + "].get_x(): " + objects[i].get_x());

	}

}
