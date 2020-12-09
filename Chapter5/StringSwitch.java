// Use a string to control a switch statement.
public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String commandString = "cancel";
		
		switch (commandString) {
		case "connect":
			System.out.println("Connecting");
			break;
		case "cancel":
			System.out.println("Canceling");
			break;
		case "disconnect":
			System.out.println("Disconnecting");
			break;
		default:
			System.out.println("Command Error!");
			break;
		}

	}

}
