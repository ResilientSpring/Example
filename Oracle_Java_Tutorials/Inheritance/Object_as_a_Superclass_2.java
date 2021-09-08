package Inheritance;

class Book2 {
	private String ISBN;

	public Book2(String isbn) {
		ISBN = isbn;
	}

	public String getISBN() {
		return ISBN;
	}

}

public class Object_as_a_Superclass_2 {

	public static void main(String[] args) {
		// Swing Tutorial, 2nd edition
		Book2 firstBook = new Book2("0201914670");
		Book2 secondBook = new Book2("0201914670");

		if (firstBook.equals(secondBook)) {
			System.out.println("objects are equal");
		} else {
			System.out.println("objects are not equal");
		}

	}

}
