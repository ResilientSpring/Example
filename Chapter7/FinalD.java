// Return a String object. 
class ErrorMsg_final {
	// Declare final constants 
	// Error codes. 
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;  
	
	String msgs[] = {
			"Output Error", 
			"Input Error",
			"Disk Full",
			"Index Out-Of_Bounds"
	};
	
	// Return the error message.
	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Error Code";	
		}
}


public class FinalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ErrorMsg_final errorMsg_final = new ErrorMsg_final();
		
		System.out.println(errorMsg_final.getErrorMsg(errorMsg_final.OUTERR));
		System.out.println(errorMsg_final.getErrorMsg(errorMsg_final.DISKERR));

	}

}
