package day39_inheritance_review_access_modifier;


public class Car extends Vehicle {
	
	private int whells;
	private int doors;
	private int gears;
	private boolean isManuel;
	private int currentGear;
	
	public Car(String name, String size, int whells, int doors, int gears, boolean isManuel) {
		super(name,size);
		this.setWhells(whells);
		this.doors = doors;
		this.gears = gears;
		this.isManuel = isManuel;
		this.currentGear = 1;
	}
	
public void changeGear(int currentGear) {
	
	this.currentGear=currentGear;

	
}

public void changeVelocity(int speed,int direction) {
	
	System.out.println("Car.changeVelocity(): Velocity" + speed +"direction" +direction);
	super.move(speed,direction);
}

@Override
public void move(int velocity, int direction) {
	setCurrentDirection(direction+10);
	setCurrentVelocity(velocity+10);
	System.out.println("Vehicle.move() : Moving at " + getCurrentVelocity() + "in direction " + getCurrentDirection());
}

public int getWhells() {
	return whells;
}

public void setWhells(int whells) {
	this.whells = whells;
}




}
