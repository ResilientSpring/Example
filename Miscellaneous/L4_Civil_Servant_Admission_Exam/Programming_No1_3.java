package L4_Civil_Servant_Admission_Exam;

public class Programming_No1_3 {
	
	static long Catalan_Number(int n) {

		long sum;

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
