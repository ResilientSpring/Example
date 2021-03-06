
public class PassOb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);

		System.out.println("ob1 has same dimensions as ob2: " + ob1.sameBlock(ob2)); // Pass an object.
		System.out.println("ob1 has same dimensions as ob3: " + ob1.sameBlock(ob3)); // Pass an object.
		System.out.println("ob1 has same volume as ob3: " + ob1.sameVolume(ob3)); // Pass an object.

	}

}
