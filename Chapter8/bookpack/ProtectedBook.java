package bookpack;

class ProtectedBook {
	
	protected String titleString;
	protected String authorString;
	protected int pubDate;
	
	public ProtectedBook(String t, String a, int p) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
