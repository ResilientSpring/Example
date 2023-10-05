package Interface;

// An interface specifies what to do, not how to do.
interface management{
	
	void parenting();
	void baby_talks();
	
	
}

class parents {
	
	String fatherString;
	String motherString;
	
}


class kids extends parents implements management{

	@Override
	public void parenting() {
		// TODO Auto-generated method stub
		System.out.println(fatherString + "'s fatherhood");
	}

	@Override
	public void baby_talks() {
		// TODO Auto-generated method stub
		System.out.println( motherString + "'s motherese");
	}
	
}


public class Implementing_Interfaces_implement_clause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kids janeKids = new kids();
		kids peterKids = new kids();
		
		janeKids.fatherString = "Jansen";
		janeKids.motherString = "Sharon";
		janeKids.baby_talks();
		janeKids.parenting();
		
		
		peterKids.fatherString = "Bill";
		peterKids.motherString = "Laura";
		

	}

}
