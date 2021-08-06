
// Return a String object. 
class ErrorMsg_final {
	// Declare final constants 
	// Error codes. 
	int outERR = 0;
	int inERR = 1;
	int diskERR = 2;
	int indexERR = 3;  
	
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

public class Final {

}
