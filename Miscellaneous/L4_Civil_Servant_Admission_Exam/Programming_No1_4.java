package L4_Civil_Servant_Admission_Exam;

public class Programming_No1_4 {
	
	static long Catalan_Number(int n) {

		// But Catalan_Number will call itself later, which might restart the sum from zero every time 
		// Catalan_Number is called and cause the intermediate result of the sum to be lost.
		//
		// Each call to Catalan_Number(n) has its own independent copy of the sum variable on the call stack.
		// So even though sum is initialized to 0 every time the function is called, 
		// this happens in the scope of that one call only.[1]
		long sum = 0;

		if (n == 0) {

			sum = 1;

			return sum;

		}

		for (int i = 0; i < n; i++) {

			sum = Catalan_Number(i) * Catalan_Number(n - 1 - i);

		}

		return sum;

	}

	public static void main(String[] args) {
		
		

	}

}

/* References:
 * 
 * 1. https://chatgpt.com/c/6869ef92-f4c8-8008-b7b6-c9d0ee97820b
 * 
 * */
