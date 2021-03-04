
class Test3{
	
	int a;
	public Test3(int i) {
		a = i;
	}
	
	static void swap(Test3 first, Test3 second){
		int intermediate;
		intermediate = first.a;
		
		first.a = second.a;
		
		second.a = intermediate;
	}	
	
}

public class Self_Test_Chpater6_No4 {

	public static void main(String[] args) {

		Test3 objectTest3 = new Test3(4);
		Test3 object2Test3 = new Test3(5);
		
		System.out.println("The contents of the objectTest3 and object2Test3 are " 
		+ objectTest3.a + " & " + object2Test3.a);
		
		Test3.swap(object2Test3, objectTest3);
		
		System.out.println("After the call of swap(), the contents of the objectTest3 and object2Test3 are " 
		+ objectTest3.a + " & " + object2Test3.a);
		
	}

}
