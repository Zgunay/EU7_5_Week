package day34PassingObjektTheMethod;

public class CarpetTest {

	public static void main(String[] args) {

	Floor f1= new Floor(10, 12)	;
	Carpet c1= new Carpet(8);
	Calculator cost= new Calculator(f1, c1);
	
	System.out.println(cost.getTotalCost());
		
		
	}

}
