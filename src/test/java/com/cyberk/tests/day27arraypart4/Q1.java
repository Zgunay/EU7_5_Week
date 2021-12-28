package day27arraypart4;

public class Q1 {

	public static void main(String[] args) {

		int [] x= {1,2,9,8,7,6,4,4,32,22,6};
		int [] y = {6,1,2,3};
		int [] z = {13,6,1,2,3};

  System.out.println(Array( x));  
  System.out.println(Array( y)); 
  System.out.println(Array(z)); 
  
	}
	
	public static boolean Array(int [] x) {
		
		if(x[0]== 6|| x[x.length-1] ==6 ) {
			
		return true;
			
		} else {
			
			return false;
			
		} 
		
	} 

}
