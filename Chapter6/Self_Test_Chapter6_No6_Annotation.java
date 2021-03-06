
class Stack2 {
	private char[] stack; 

	private int push_at, pop_at; 

	public Stack2(int size) {

		stack = new char[size]; 
		push_at = 0; 
		pop_at = size - 1;

	}

	public Stack2(char[] char_array) {  // Array in Java is implemented as objects. Thus, it is called by reference.
		
		push_at = 0;
		pop_at = char_array.length - 1;
		
		stack = new char[char_array.length];  // In case of call by reference, it's better to make a copy of the argument for later manipulation because changes to the object inside the method will affect the object used as an argument.  See page 138 and 218 of the textbook.
		
		// Copy elements
		for (int i = 0; i < char_array.length; i++) push(char_array[i]);
	}

	public Stack2(Stack2 objectStack) {

		push_at = 0;
		this.pop_at = objectStack.stack.length -1;
		stack = new char[objectStack.stack.length];
		
		// Copy elements
		for (int i = 0; i < objectStack.stack.length; i++) {
			stack[i] = objectStack.stack[i];
		}
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
			return (char) 0;
		} else {
			return stack[pop_at--];
		}
	}
}

public class Self_Test_Chapter6_No6_Annotation {
	
	public static void main(String[] args) {

		// Create 10-element empty stack.
		Stack2 stack2_I = new Stack2(10);

		char name[] = { 'T', 'O', 'M' };

		// Construct stack from array.
		Stack2 stack2_II = new Stack2(name);

		char ch;
		int j;

		// push some characters into stack1
		for (j = 0; j < 10; j++) {
			stack2_I.push((char) ('A' + j));
		}

		// Construct stack from another stack
		Stack2 stack2_III = new Stack2(stack2_I);

		// show the stack
		System.out.print("Content of stack1: ");
		for (j = 9; j > -1; j--) {

			ch = stack2_I.pop();

			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Content of stack2: ");
		for (j = 2; j > -1; j--) {

			ch = stack2_II.pop();

			System.out.print(ch);
		}
		
		System.out.println("\n");

		System.out.print("Content of stack3: ");
		for (j = 9; j > -1; j--) {

			ch = stack2_III.pop();

			System.out.print(ch);
		}

	}

}
