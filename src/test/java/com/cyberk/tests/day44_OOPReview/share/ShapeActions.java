package day44_OOPReview.share;

import static day44_OOPReview.share.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeActions {

	public static void main(String[] args) {

	Square mySquare = new Square();
	ShapeManager.drawSquare(mySquare);
	
	drawSquare(mySquare);// import static day44_OOPReview.share.ShapeManager.*;  bunu import yapman gerekiyor.Cunku static method..
	
	String type= "square";
	drawSquare((Square) buildShape(type)); // down casting square to shape...
	
	
	Object rand = new Random();
	
	System.out.println(((Random) rand).nextInt(5));
	
	System.out.println("++++++++++++++++++");
	
	List<Shape> myList = new ArrayList<>();
	myList.add(new Shape());
	myList.add(new Traiangle());
	myList.add(new Shape());
	myList.add(new Square());
	
	drawShape(myList);
	
	}

}
