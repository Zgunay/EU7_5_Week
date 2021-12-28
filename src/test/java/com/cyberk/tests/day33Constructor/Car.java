package day33Constructor;

public class Car {
	
	
	String model;
	String make;
	int year;
	double mile;
	String color;
	String model1;
	
	public Car() {
		
		model="Honda";
		make="Civic";
		year=2020;mile=5000;
		color="red";
		
	}
	


	public Car(String model, String make, int year, double mile, String color) {
	
		this.model = model;
//		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}



	public Car(double mile, String color) {
		
		this.mile = mile;
		this.color = color;
	}
	
	
	
	
	

}
