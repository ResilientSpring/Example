interface MyIF{
	
	// This is a "normal" interface method declaration.
	// It does NOT define a default implementation.
	int getUserID();
	
	
	// This is a default method. Notice that it provides a default implementation.
	default int getAdminID() {
		return 1;
	}
}


class MyIFImp implements MyIF{

	// Only getUserID() defined by MyIF needs to be implemented. getAdminID() can be allowed to default.
	public int getUserID() {
		
		return 100;
	
	}
	
}


public class default_method_fundamentals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
