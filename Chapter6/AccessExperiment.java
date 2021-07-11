
public class AccessExperiment {
	
	private int alpha; // private access
	public int beta;  // public access
	int gamma;       // default access
	
	/* Methods to access alpha. It is OK for a member of a class to access a private member of the same class.*/
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessExperiment exploitationAccessExperiment = new AccessExperiment();
		
		exploitationAccessExperiment.alpha = 10;
		
		System.out.println("exploitation.alpha is " + exploitationAccessExperiment.getAlpha());

	}

}
