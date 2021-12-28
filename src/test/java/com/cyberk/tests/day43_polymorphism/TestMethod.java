package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {

		ChildA chA= new ChildA();
		chA.m1();
		chA.m2();
		chA.m3();
		ChildB chB =new ChildB();
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1 = new ChildA(); // poly
		p1.m1();
		
		p1.m1(); // digerleri override degil
		
		Parent p2 = new ChildB(); // poly
		p2.m1();// digerleri override degil
		
		MyInterface int1= new ChildA(); //polly
		int1.m2(); // digerleri override degil
		
		MyInterface int2= new ChildB(); //polly
		int2.m2(); // digerleri override degil
		
		ChildA p11 = (ChildA) p1; // Casting (down-casting)
		p11.m1();
		p11.m2();
		p11.m3();
		ChildB p22 = (ChildB) p2;
		p22.m2();
		p22.m4();
		p22.m1();
		
		((ChildA) p1).m2();
		
		}
}

class Parent {
	public void m1() {}
}
	
	interface MyInterface {
		void m2();
	}
	
 class ChildA extends Parent implements MyInterface {

		@Override
    	public void m2() {}
		public void m3() {}
				
	}
 
 class ChildB extends Parent implements MyInterface{

	@Override
	public void m2() { }
	public void m4() {}
	 
 }
