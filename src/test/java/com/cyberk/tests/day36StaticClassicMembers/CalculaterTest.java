package day36StaticClassicMembers;

public class CalculaterTest {

	public static void main(String[] args) {

		double result= Calculator.plus(55, 7);
		System.out.println(result);
		
		Calculator c= new Calculator();
		System.out.println(c.plus(55, 7));
		
		int i= Integer.parseInt("33");
		System.out.println(Character.isDigit('6'));
		
		CalculaterTest calculaterTest = new CalculaterTest();
		calculaterTest.m1();
		
		CalculaterTest.m1();
	}
	
		
public static void  m1() {
	
	System.out.println("hello");
	
	}

public static void  m2() {
	
	System.out.println("java");

}

}
