package day34PassingObjektTheMethod;

public class Carpet {
	
	double costOfType;

	public Carpet(double costOfType) {
		
		if(costOfType<0) {
			costOfType=0;
		}else {
			
		this.costOfType = costOfType;
		}
	
	}
	
	public double getCost() {
		
		return costOfType;
	}
	

}
