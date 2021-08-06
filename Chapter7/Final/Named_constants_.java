package Final;

// An enumeration is a list of named constants that define a new data type.
public enum Named_constants_ {
	Zero,
	One,
	Two,
	Three,
	Four,
	Five,
	Six,
	Seven,
	Eight,
	Nine

}

class exploitation {
	
	
	public static void main(String[] args) {
		
		Named_constants_ falloutConstants_ = Named_constants_.Eight;
		
		Named_constants_ rock_solidConstants_ = falloutConstants_;
		
		System.out.println(rock_solidConstants_);
	}
}
