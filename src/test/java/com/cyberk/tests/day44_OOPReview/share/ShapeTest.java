package day44_OOPReview.share;

public class ShapeTest {

	public static void main(String[] args) {
		// creates 4 shapes, usung polyporhmisium
		
		Shape s1= new Diamand();
		s1.type="Diamond";
		s1.draw();
		
		Shape s2= new Square();
		s2.draw();
		
		Shape s3= new Traiangle();
		s3.draw();
		
		Object s4 = new Shape();
		((Shape) s4).draw();

	}

}

