
public class FSDemo_experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FailSoftArray failSoftArray = new FailSoftArray(12, -1);
		
		System.out.println(failSoftArray.get(4)); 
		
		int b[] = new int[12];
		System.out.println(b[4]);
		
		failSoftArray.put(18, 6);
		
		System.out.println(failSoftArray.get(18));

	}

}
