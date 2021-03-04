
class Stack {
	private char[] stack; // This array holds the stack input.

	private int push_at, pop_at; // the push and pop indices.

	public Stack(int size) {

		stack = new char[size]; // Allow the user to specify the size of the stack when it is created.
		push_at = 0; // the push indices (plural of index) are initially set to zero.
		pop_at = size - 1;

	}

	public Stack(char[] char_array) {
		// TODO Auto-generated constructor stub
		push_at = 0;
		pop_at = char_array.length - 1;
		
		stack = new char[char_array.length];
		
		// Copy elements
		for (int i = 0; i < char_array.length; i++) push(char_array[i]);
	}

	public Stack(Stack objectStack) {

		push_at = objectStack.push_at;
		this.pop_at = objectStack.pop_at;
		stack = new char[objectStack.stack.length];
		
		// Copy elements
		for (int i = pop_at; i < push_at; i++) {
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

public class Self_Test_Chapter6_No3 {

	public static void main(String[] args) {

		// Create 10-element empty stack.
		Stack stack1 = new Stack(10);

		char name[] = { 'T', 'O', 'M' };

		// Construct stack from array.
		Stack stack2 = new Stack(name);

		char ch;
		int j;

		// push some characters into stack1
		for (j = 0; j < 10; j++) {
			stack1.push((char) ('A' + j));
		}

		// Construct stack from another stack
		Stack stack3 = new Stack(stack1);

		// show the stack
		System.out.print("Content of stack1: ");
		for (j = 9; j > -1; j--) {

			ch = stack1.pop();

			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Content of stack2: ");
		for (j = 2; j > -1; j--) {

			ch = stack2.pop();

			System.out.print(ch);
		}
		
		System.out.println("\n");

		System.out.print("Content of stack3: ");
		for (j = 9; j > -1; j--) {

			ch = stack3.pop();

			System.out.print(ch);
		}

	}

}
