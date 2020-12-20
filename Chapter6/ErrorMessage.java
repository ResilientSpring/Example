// Return a String object. 
class ErrorMsg{
	
	String msgs[] = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};
	
	// Return the error message. 
	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		return "Invalid Error Code";
	}
}


public class ErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ErrorMsg err = new ErrorMsg();
		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));

	}

}
