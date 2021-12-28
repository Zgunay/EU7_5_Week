package day15;

public class min {

	public static void main(String[] args) {
		
	System.out.println(minFunction(10,12));	

	}
	
	public static int minFunction(int n1, int n2) {
		int min;
		   if (n1 > n2)
		      min = n2;
		   else
		      min = n1;

		   return min; 
		}
	public static int minFunction(int n1, long n2) {
		int min;
		   if (n1 > n2)
		      min = (int) n2;
		   else
		      min = n1*6;

		   return min; 
		}

}
