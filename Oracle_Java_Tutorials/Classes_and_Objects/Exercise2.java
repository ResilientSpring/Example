package Classes_and_Objects;

class NumberHolder {
    public int anInt;
    public float aFloat;
    
    public NumberHolder(int a, float b) {
		anInt = a;
		aFloat = b;
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberHolder symposiumNumberHolder = new NumberHolder(1, 2);
		
		System.out.println(symposiumNumberHolder.anInt + symposiumNumberHolder.aFloat);
		
		System.out.println(symposiumNumberHolder.anInt + ", " + symposiumNumberHolder.aFloat);

	}

}
