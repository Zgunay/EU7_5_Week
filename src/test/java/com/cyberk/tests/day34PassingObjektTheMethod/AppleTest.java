package day34PassingObjektTheMethod;

public class AppleTest {

	public static void main(String[] args) {
		Apple a1= new Apple();
		a1.color= "White";
		changeApple(a1);
		
		int x=5;
		mtA(x);
		System.out.println(methodObject().color);
		methodObject().color="Brown";
	}
	
	public static void changeApple(Apple b1) {
		
		b1.color="Yellow";
		b1.mA();
						
	}
	
	public static void mtA(int b) {
		
		b=5;
	}
	
	public static Apple methodObject() {
		Apple a1= new Apple();
		
		return a1;
	}

}
