interface MyIF{
	
	// This is a "normal" interface method declaration.
	// It does NOT define a default implementation.
	int getUserID();
	
	
	// This is a default method. Notice that it provides a default implementation.
	default int getAdminID() {
		return 1;
	}
}


public class default_method_fundamentals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
