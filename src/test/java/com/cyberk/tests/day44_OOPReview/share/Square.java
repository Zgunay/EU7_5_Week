package day44_OOPReview.share;

public class Square extends Shape{
	
	public Square() {
		type= "square";
		
	}

	@Override
	public void draw() {
		System.err.println("Drawing a square");
	}
	public void squareMethod() {
		System.out.println("Square Method");
	}

}
