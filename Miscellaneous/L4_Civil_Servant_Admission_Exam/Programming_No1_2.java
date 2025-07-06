package L4_Civil_Servant_Admission_Exam;

import Cpp.static_variable;

public class Programming_No1_2 {

	long static Catalan_Number(int n) {

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

		System.out.println(Catalan);
		
		
	}

}
