package day13Method;

public class pattern {

	public static void main(String[] args) {

pattern(5);
		
	}
	
	public static void pattern(int a) {
		int b,c;
		c=a;
		for ( a=1;a<=c; a++) {
			for(b=1;b<=a;b++)
				System.out.print("*");
			System.out.println();
			
		}
		
	}

}
