package theoretical;

import Cpp.this_keyword;

class TwoDShaper_2{
	
	private double width;
	private double height;
	private String title;
	
	public TwoDShaper_2(double w, double h) {
		// TODO Auto-generated constructor stub
	}
	
	public TwoDShaper_2() {
		// TODO Auto-generated constructor stub
	}
	
	TwoDShaper_2(double width, double height, String title){
		
		this.width = width;
		this.height = height;
		this.title = title;
		
	}
	
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	String showTitle() {
		return title;
	}
	
}


class Triangular_2 extends TwoDShaper_2{
	
	private String style;
	
	public Triangular_2() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangular_2(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	Triangular_2(String style, String title, double width, double height){
		
		super(width, height, title);
		
		this.style = style;
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
}


public class Using_super_to_call_superclass_constructor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
