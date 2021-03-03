
class Stack {
	private char[] stack;  // This array holds the stack input. 
	
	private int push_at, pop_at; // the push and pop indices.
	
	public Stack(int size) {
		
		stack = new char[size];  // Allow the user to specify the size of the stack when it is created. 
		push_at = 0;  // the push indices (plural of index) are initially set to zero. 
		pop_at = size -1;  
		
	}
	
	void push(char ch) {
		if (push_at == stack.length) {
			System.out.println(" - Stack is full.");
		} else {
			stack[push_at++] = ch;
		}		
	}
	
	char pop() {
		if (pop_at < 0) {
			System.out.println(" - Stack is empty");
			return 0;
		} else {
			return stack[pop_at--];
		}
	}
}

public class Self_Test_Chapter6_No3 {

	public static void main(String[] args) {
		

	}

}
