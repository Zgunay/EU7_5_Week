package day35Encaplation;

public class Carpet {

double cost;

public Carpet(double cost) {
	
	if(cost<0) {
		this.cost=0;
	}else {
		this.cost = cost;
	}
	
}

	private double getCost() {
	
	return cost;
}
	
	
}


