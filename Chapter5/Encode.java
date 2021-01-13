// Use XOR to encode and decode a message.
public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "This is a test";
		String encmsgString = "";
		String decmsgString = "";
		
		int key = 88;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		// encode the message 
		for (int i = 0; i < msg.length(); i++) 			
			encmsgString = encmsgString + (msg.charAt(i) ^ key);  // This constructs the encoded string. 
		
		System.out.print("Encoded message: ");
		System.out.println(encmsgString);
		
		// decode the message
		for (int i = 0; i < msg.length(); i++) {
			
			decmsgString = decmsgString + (encmsgString.charAt(i) ^ key);  // This construct the decoded string. 			
		}
		
		System.out.print("Decoded message: ");
		System.out.println(decmsgString);

	}

}
