// Book recorded for public use.

package bookpack;

class Book2{
	private String titleString;
	private String authorString;
	private int pubDate;
	
	// Now public.
	public Book2(String t, String a, int d) {
		titleString = t;
		authorString = a;
		pubDate = d;
	}
	
	public void show() {
		System.out.println(titleString);
		System.out.println(authorString);
		System.out.println(pubDate);
		System.out.println();
	}
	
}

public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
