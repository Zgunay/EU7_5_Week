package day15;

public class CellPhoneObjekt {

	public static void main(String[] args) {
		CellPhone cr= new CellPhone();
		cr.colorr="red";

		CellPhone cell1=new CellPhone();
		CellPhone cell2=new CellPhone();
		 
		System.out.println(cell1.brand);
		System.out.println(cell1.colorr);
		System.out.println(cell1.price);
		
		
		cell1.brand="Samsung";
		cell1.colorr="Red";
		cell1.price= 1200;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.colorr);
		System.out.println(cell1.price);
		
		cell1.colorr="Yellow";
		System.out.println(cell1.colorr);
		boolean bool;
		
bool= !(1<8 && (5>2||3<5));		
System.out.println(bool);

		
		
	}

}
