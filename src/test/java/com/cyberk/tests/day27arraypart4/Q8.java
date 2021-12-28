package day27arraypart4;

public class Q8 {

	public static void main(String[] args) {

  int[] x= {5,6,5,4,7,8,9};
  int[] y= {4,3};
  int[] z= {4,5};	
		
  System.out.println(Array(x));
  System.out.println(Array(y));
  System.out.println(Array(z));

	}
	
	public static String Array (int [] x) {
		
		for (int i=0; i<x.length; i++) {
			
			if (x[i]==2 || x[i]==3) {
				
			return "true";
			}  
			
			
		} return "false";
		
		
		
	}
	

}
