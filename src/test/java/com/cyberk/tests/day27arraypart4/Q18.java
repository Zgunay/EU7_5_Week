package day27arraypart4;

import java.util.Arrays;

public class Q18 {

	public static void main(String[] args) {

		int [] x= {1,2,2};
		int [] y= {1,2,2,56,6,99,7};
		int [] z= {1,1,6,7,2};
		System.out.println(Array(x));
		System.out.println(Array(y));
		System.out.println(Array(z));
	}
	
	public static int Array( int[] x) {
		
		int sum=0;
		int m=Arrays.binarySearch(x,6);
        int n=0;
for(int b=0;b<x.length;b++) {
	if(x[b]==7) {
		
		n=b+1;
	}
	
}
		
		if(m>0 && n>0) { 
			
			for(int i=0; i<m;i++) {
							
				sum=sum+x[i];
			} for(int k=n; k<x.length; k++ ) {
				
				sum=sum+x[k];
			}
				
		} else  if (m<=0|n<=0) {
			for (int value:x)
			
			sum=sum+value;
		}
		
			return sum;
		
	}

}
