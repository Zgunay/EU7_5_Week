package day33Constructor;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	public Mouse(int weight) {
		this(30,weight);
		this.weight=weight;
		System.out.println("Java");
		
	}

	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("Js");
	}

	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
		
	}

}
