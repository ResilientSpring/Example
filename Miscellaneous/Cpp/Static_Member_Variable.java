package Cpp;

class ShareVar{
	static private int num;
	
	public void setnum(int i) {
		num = i;
	}
	
	public void shownum() {
		System.out.println(num);
	}
}

public class Static_Member_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShareVar aShareVar = new ShareVar();
		ShareVar bShareVar = new ShareVar();
		
		aShareVar.shownum();
		bShareVar.shownum();
		
		aShareVar.setnum(10);
		
		aShareVar.shownum();
		bShareVar.shownum();
		

	}

}
