// Some String operations.
public class StrOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "When it comes to Web programming, Java is #1.";
		String str2 = new String(str1);
		String str3 = "Java strings are powerful.";
		int result, idx;
		char ch;
		
		System.out.println("Length of str1: " + str1.length());
		
		// display str1, one char at a time. 
		for (int i = 0; i < str1.length(); i++) System.out.print(str1.charAt(i));
		
		System.out.println();
		
		for (int i = 1; i <= str1.length(); i++) System.out.print(str1.charAt(i));
		
		System.out.println();

	}

}
