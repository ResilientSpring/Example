// A short package demonstration.

package bookpack; // This file is part of bookpack package.

class Book {      // Thus, Book is part of bookpack.
	private String titleString;
	private String authorString;
	private int pubDate;
	
	public Book(String t, String a, int d) {
		// TODO Auto-generated constructor stub
		titleString = t;
		authorString = a;
		pubDate = d;
	}
	
	void show() {
		System.out.println(titleString);
		System.out.println(authorString);
		System.out.println(pubDate);
		System.out.println();
	}
}

public class BookDemo {  // BookDemo is also part of bookpack.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book booksBook[] = new Book[5];

	}

}
