package day17_classObjekt;

public class CarObjekt {

	public static void main(String[] args) {
		BMW make = null;
		System.out.println(make);
		BMW b1=new BMW();
		
		BMW b2=new BMW();
		System.out.println(b1.make);
		b1.model= "m3";
		b1.showPrice();

		b2.model="x3";
		b2.showPrice();
	
		
		

	}

}
