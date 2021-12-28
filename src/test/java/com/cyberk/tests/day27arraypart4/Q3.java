package day27arraypart4;

public class Q3 {

	public static void main(String[] args) {

int [] x= {1,3};
int [] y= {1,2,3};

System.out.println(Array(x,y));
		
		
	}
	
	
	public static String Array( int [] x, int [] y) {
		
		if(x.length<=1) {
			
			return "array 1 is not valid";
		} if(y.length<=1) {
		
		return "array 2 is not valid";
	}  if ((x.length>1 && y.length>1) && ((x[0]==y[0] ) || x[x.length-1] == y[y.length-1]) ) {
		
		
		return "true";
	} else {
		
		return "false";
	}
		
		
	}

}
