package day36StaticClassicMembers;

public class Dog {
	
	private static String name;
	
	Dog(String name) {
		this.name=name;
	}
	public void printName() {
		System.out.println("name= " + name);
	}
}

