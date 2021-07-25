package bookpack;

public class Book3 {
	
	private String titleString;
	private String authorString;
	private int pubDate;
	
	// Now public.
	public Book3(String t, String a, int d) {
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
