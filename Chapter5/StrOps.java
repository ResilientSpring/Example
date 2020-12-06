// Some String operations.
public class StrOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "When it comes to Web programming, Java is #1.";
		String str2 = new String(str1);
		String str3 = "Java strings are powerful.";
		String str4 = "When it comes to Web programming, Java is #1.";
		String str5 = "Java strings are powerful!";
		int result, idx;
		char ch;
		
		System.out.println("Length of str1: " + str1.length());
		
		// display str1, one char at a time. 
		for (int i = 0; i < str1.length(); i++) System.out.print(str1.charAt(i));
		
		System.out.println();
		
		// String value is stored in array by Java.
	//	for (int i = 1; i <= str1.length(); i++) System.out.print(str1.charAt(i));
		
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else {
			System.out.println("str1 does not equal str2");
		}
		
		if (str1.equals(str4)) {
			System.out.println("str1 equals str4");
		} else {
			
			System.out.println("str1 does not equal str4");

		}
		
		System.out.println();
		
		if (str1.equals(str3)) {
			System.out.println("str1 equals str3");
		} else {
			System.out.println("str1 does not equal str3");
		}
		
		System.out.println();
		
		result = str1.compareTo(str3);
		if (result == 0) {
			System.out.println("str1 and str3 are equal");
		} else if (result < 0) {
			System.out.println("str1 is less than str3");

		} else {
			System.out.println("str1 is greater than str3");
		}
		
/* @ compareTo()
 * 
 * If two strings are different, 
 * then either they have different characters at some index that is a valid index for both strings, or their lengths are different,or both. 
 * If they have different characters at one or more index positions, let k be the smallest such index; then the string whose character at position k has the smaller value, as determined by using the < operator, lexicographically precedes the other string. 
 * In this case, compareTo returns the difference of the two character values at position k in the two string -- that is, the value: 

 this.charAt(k)-anotherString.charAt(k)
 
If there is no index position at which they differ, then the shorter string lexicographically precedes the longer string. 
In this case, compareTo returns the difference of the lengths of the strings -- that is, the value: 
 this.length()-anotherString.length()
		 * 
		 * */
		
		result = str3.compareTo(str5);
		if(result == 0) System.out.println("str3 and str5 are equal");
		else if(result < 0) System.out.println("str3 is less than str5");
		else System.out.println("str3 is greater than str5");
		
		System.out.println();
		
		// assign a new string str2
		str2 = "One Two Three Four Two";
		
		idx = str2.indexOf("One");
		System.out.println("Index of first occurence of One: " + idx);
		
		idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurence of One: " + idx);
		
		idx = str2.indexOf("Two");
		System.out.println("Index of first occurence of Two: " + idx);
		
		idx = str2.lastIndexOf("Two");
		System.out.println("Index of last occurence of Two: " + idx);
     }

}
