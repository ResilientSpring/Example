
public class Self_Test_Chapter5_No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "This is a test";
		String encmsgString = "";
		String decmsgString = "";
		
		char[] key = {'8' , 's', 'c', 'r', 'i', 'p', 't', 's', '/', 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', 'i', 's', 't', 'i', 'c', 's'};
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		// encode the message 
		for (int i = 0; i < msg.length(); i++) 			
			encmsgString = encmsgString + (char) (msg.charAt(i) ^ key[i]);  // This constructs the encoded string. 
		
		System.out.print("Encoded message: ");
		System.out.println(encmsgString);
		
		// decode the message
		for (int i = 0; i < msg.length(); i++) {
			
			decmsgString = decmsgString + (char) (encmsgString.charAt(i) ^ key[i]);  // This construct the decoded string. 			
		}
		
		System.out.print("Decoded message: ");
		System.out.println(decmsgString);

	}

}
