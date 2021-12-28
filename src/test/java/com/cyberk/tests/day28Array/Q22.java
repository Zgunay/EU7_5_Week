package day28Array;

public class Q22 {

	public static void main(String[] args) {

		
	int [] x= {1,4,1};
	int [] y= {1,4,1,4};
	int [] z= {1,1};

	System.out.println(Array(x));
	System.out.println(Array(y));
	System.out.println(Array(z));

		
	}
	
	public static boolean Array(int[] x) {
		
		if(x.length<4) {
			
			return true;
		}else {
						
				if(x[0]==x[3]) {
					return true;
				}else 
					return false;
				
					
		}
			
			
		}
			
		
	

}
