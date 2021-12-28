package day27arraypart4;

public class Q4 {

	public static void main(String[] args) {

int [] x= {1,2,3};
int [] y= {5,11,2};
int [] z= {7,0,0};
int [] a= {3,-2,10,4};

System.out.println(Array(x));
System.out.println(Array(y));
System.out.println(Array(z));
System.out.println(Array(a));
		
		
	}
	
	public static int Array(int [] x) {
		int sum=0;
		for(int i=0; i< x.length; i++) {
			
			sum= sum+ x[i];
						
			
		} return sum;
		
		
	} 

}
