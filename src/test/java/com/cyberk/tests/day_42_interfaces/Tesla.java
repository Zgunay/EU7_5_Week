package day_42_interfaces;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	}

	@Override
	public void start() {
		System.out.println("Tesla is statrting quitely..");
		
	}

	@Override
	public void charge() {
		System.out.println(" Tesla charging - plugin to Electric outlet..");
		System.out.println("Change to Drive mode.. ");
		
	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving");
		
	}
	
	

}
