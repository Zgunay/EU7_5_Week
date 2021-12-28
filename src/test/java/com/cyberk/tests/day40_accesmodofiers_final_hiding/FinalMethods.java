package day40_accesmodofiers_final_hiding;

public final class FinalMethods {
	String s="aa";
	
	public final void method1() {
		System.out.println("Method-1");
	}
	
public static  void staticMethod(String word) {
	System.out.println("Static Method");
}
class Sub extends FinalMethods {
	
	@Override
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	
	
	public static void staticMethod(String word) {
		System.out.println("Static method in sub class");
	}
}


}
