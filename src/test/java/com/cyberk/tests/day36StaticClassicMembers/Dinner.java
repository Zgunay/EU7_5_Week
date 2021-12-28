package day36StaticClassicMembers;

public class Dinner {
	
	static int pizzaSlice=8;
	
	public void takeASlice() {
		
		pizzaSlice--;
	}
	
	public void takeAslice(int count) {
		pizzaSlice-=count;
	}

}
