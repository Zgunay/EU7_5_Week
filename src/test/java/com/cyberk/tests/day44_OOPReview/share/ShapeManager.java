package day44_OOPReview.share;

import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape= null;
		switch(type.toLowerCase()) {
		
		case "shape":
			shape= new Shape();
			break;
			
		case "triangle":
			shape= new Traiangle();
			break;
			
		case "square":
			shape= new Square();
			break;
			
		case "diamond":
			shape= new Diamand();
			break;
		}
		return shape;
		
		}
	
	public static void drawSquare(Square SquareObject) {
		
		System.out.println("Drawing a square");
		SquareObject.draw();
	}
	public static void drawShape(Shape shape) {
		
		System.out.println("Drawing a shape");
		shape.draw();
	}
	public static void drawShape(List<Shape> shapeList) {
		for(Shape each : shapeList) {
			each.draw();
		}
		
	}
}
