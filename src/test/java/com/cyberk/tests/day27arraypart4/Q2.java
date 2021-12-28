package day27arraypart4;

public class Q2 {

	public static void main(String[] args) {


int [] x= {1,2,9,8,7,6,4,4,32,22,6};
int [] y = {3,1,2,3};
int [] z = {13,6,1,2,3};
int [] k = {1};


System.out.println(Array( x));  
System.out.println(Array( y)); 
System.out.println(Array(z)); 
System.out.println(Array(k)); 
		
	}
	
	public static String Array(int[] x) {
		
		if((x.length<=1)) {
			
			return "not valid Array";
			
			} else if (x.length>1 && x[0]==x[x.length-1]) {
									
			return "true";
			
		} else {
			
				return "false"; 
		} 
		


		
		
	}
	

}
