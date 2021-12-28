package day34PassingObjektTheMethod;

public class Calculator {
	double width;
	double length;
	double costOfType;
	
//	Floor floor= new Floor( width, length );
//	
//	Carpet carpet = new Carpet(costOfType);
	
	Floor floor;
	Carpet carpet;
	

	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		
				
		return floor.getArea()*carpet.getCost();
		
	}

}
