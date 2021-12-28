package day13Method;

public class pattern1 {

	public static void main(String[] args) {
		
		
		pattern(5);

	}

	public static void pattern(int a) {
		
		for(int k=1; k<=a; k++) {
		  for(int m=k; m<=a; m++)	{
			  System.out.println("+");
			 
		  }
			
		}
		
	}
}
