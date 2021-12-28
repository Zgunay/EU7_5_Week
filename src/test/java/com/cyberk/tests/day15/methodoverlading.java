package day15;

public class methodoverlading {

	public static void main(String[] args) {

		System.out.println(calcFeetAndInchesToCentimeters(100,0));
		
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double Feet, double inches) {
		
		if (Feet>=0 && ((inches>=0 && inches<=100))) {
		
			double cen= Feet*12*2.54 + inches*2.54;
			return cen; 
			
		} else {  
		
		return -1;
		
					
		}
		
			
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches<0) {
			return -1;
			
		} 
		double feet= (int) inches/12;
		double remainingInches= inches%12;
		System.out.println(inches + " inches= "  +feet+ " feet and " + remainingInches+ " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches) ;
		 
		
		
		
	}

}

