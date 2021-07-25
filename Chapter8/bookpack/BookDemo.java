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
		
		booksBook[0] = new Book("Java: A Beginner's Guide", "Schildt", 2019);
		booksBook[1] = new Book("Java: The Complete Reference", "Schildt", 2019);
		booksBook[2] = new Book("Introducing JavaFX 8 Programming", "Schildt", 2015);
		booksBook[3] = new Book("Red Storm Rising", "Clancy", 1986);
		booksBook[4] = new Book("On the Road", "Kerouac", 1955);
		
		for (int i = 0; i < booksBook.length; i++) {
			booksBook[i].show();
		}

	}

}
