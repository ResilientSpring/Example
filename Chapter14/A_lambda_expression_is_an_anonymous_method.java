
public class A_lambda_expression_is_an_anonymous_method {
	
	static double myMeth() {
		return 98.6;
	}
	
// Lambda form:	() - > 98.6;

	
	public static void main(String[] args) {
		
		var x = myMeth();
		
		System.out.println(x);
		
		var y = () -> 98.6;
		
		System.out.println(y);
		
	}
}
