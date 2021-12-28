package day44_OOPReview.share;

public class Traiangle extends Shape{
	
	public Traiangle() {
		type="Triangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}

}
