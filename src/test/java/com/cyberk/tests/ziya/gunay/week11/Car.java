package ziya.gunay.week11;

public abstract class Car {

	private String make,model,color;
	int year;
	public Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public abstract void start();
	
}
