// Return a programmer-defined object. 
class Err {

	String msgString; // error message
	int severity; // code indicating severity of error.

	public Err(String m, int s) {
		msgString = m;
		severity = s;
	}
}

class ErrorInfo{
	String msgs[] = {"Output Error", "Input Error", "Disk Full", "Index Out-of-Bounds"};
	
	int howbad[] = {3, 3, 2, 4};
	
	Err getErrorInfo(int i) {          // Return an object of type Err. 
		if(i >= 0 & i < msgs.length )
			return new Err(msgs[i], howbad[i]);
		else 
			return new Err("Invalid Error Code", 0);
	}
}

public class ErrInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ErrorInfo errorInfo = new ErrorInfo();
		Err e;
		
		e = errorInfo.getErrorInfo(2);
		System.out.println(e.msgString + " severity: " + e.severity);
		
		e = errorInfo.getErrorInfo(19);
		System.out.println(e.msgString + " severity: " + e.severity);

	}

}
