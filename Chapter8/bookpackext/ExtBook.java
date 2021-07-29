package bookpackext;

public class ExtBook extends bookpack.ProtectedBook2 {
	
	private String publisher;
	
	public ExtBook(String t, String a, int p, String publisher) {
		super(t, a, p);
		// TODO Auto-generated constructor stub
		this.publisher = publisher;
	}
	
	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String p) {
		publisher = p;
	}
	
	// These are OK because subclass can access a protected member.
	public String getTitle() {
		return titleString;
	}
	
	public void setTitle(String t) {
		titleString = t;
	}
	
	public String getAuthorString() {
		return authorString;
	}
	
	public void setAuthor(String a) {
		authorString = a;
	}
	
	public int getPubDate() {
		return pubDate;
	}
	
	public void setPubDate(int d) {
		pubDate = d;
	}

}
