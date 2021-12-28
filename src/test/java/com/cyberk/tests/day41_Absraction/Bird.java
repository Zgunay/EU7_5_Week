package day41_Absraction;

public abstract class Bird extends Animal {

	
		@Override
	public void eat() {
System.out.println("Bird is eating");		
	}

	@Override
	public void breathe() {
System.out.println("Bird is breathing");		
	}

	public abstract void fly();
	
}
