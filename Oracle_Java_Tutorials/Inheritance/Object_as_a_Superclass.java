package Inheritance;

class Book {
	private String ISBN;

	public Book(String isbn) {
		ISBN = isbn;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Book)
			return ISBN.equals(((Book) obj).getISBN());
		else
			return false;
	}
}

public class Object_as_a_Superclass {

	public static void main(String[] args) {

		// Swing Tutorial, 2nd edition
		Book firstBook = new Book("0201914670");
		Book secondBook = new Book("0201914670");

		if (firstBook.equals(secondBook)) {
			System.out.println("objects are equal");
		} else {
			System.out.println("objects are not equal");
		}

	}

}
