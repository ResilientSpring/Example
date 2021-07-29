// Demonstrate import.
package bookpackext;
import bookpack.*;

public class UseBook_asterisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 books[] = new Book3[5];
		
		books[0] = new Book3("Java: A Beginner's Guide", "Schildt", 2019);
		books[1] = new Book3("Java: The Complete Reference", "Schildt", 2019);
		books[2] = new Book3("Introducing JavaFX 8 Programming", "Schildt", 2015);
		books[3] = new Book3("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book3("On the Road", "Kerouac", 1995);
		
		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}

	}

}
