package day42_interface;

public abstract class ElectricCar {
	private String model;
	private double price ;
	private String color;
	
	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	public abstract void start(); 
	public abstract void charge(); 
	public abstract void drive();
	public void stop() {
		System.out.println("Electric car is stoppng by pushung the break...");
		
	}
	

	public ElectricCar(String model, double price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	
	
	

}
