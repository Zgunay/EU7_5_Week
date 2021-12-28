package day17_classObjekt;

public class BMW {
	
	
	int make;
	static String model;
	static double price;
	public static void showPrice() {
		
		switch(model) {
		
		case"330i":
			price=40250;
			break;
			
		case"740i":
			price=85000;
			break;
			
		case"m3":
			price=65000;
			break;
			
			default:
				System.out.println(model +" is not available");
				price=0.0;
	}
		
		System.out.println("PRICE"+ price);
		
		

}
}
