
class supra_class{
	private int a = 1;
	
	int get(){
		return a;
	}
	
	void amendment(int new_number){
		a = new_number;
	}
}

class elitist extends supra_class{
	int b = a * 5;
}

public class Self_Test_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
