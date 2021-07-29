package bookpack;

public class ProtectedBook2 {
	
	protected String titleString;
	protected String authorString;
	protected int pubDate;
	
	public ProtectedBook2(String t, String a, int p) {
		// TODO Auto-generated constructor stub
		
		titleString = t;
		authorString = a;
		pubDate = p;
	}
	
	public void show() {
		System.out.println(titleString);
		System.out.println(authorString);
		System.out.println(pubDate);
		System.out.println();
	}

}
