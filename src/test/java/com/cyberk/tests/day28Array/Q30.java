package day28Array;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {

		int[] y= {1,2,3};
		int b=2;
		
		int[] x= {1,2,3,2,5,2,6,7,2,5,7};
		int a=2;
		
	System.out.println(Arrays.toString(Array(y,b)));	
	System.out.println(Arrays.toString(Array(x,a)));	
		
	}
	
	public static int [] Array(int [] x, int n) {
		
		for (int i=0; i<x.length-2;i++) {
			
			if(x[i+1]==n && x[i+2]> x[i]) {
				
				x[i+1]=x[i+2];
								
			}else if(x[i+1]==n && x[i+2]< x[i]) {
			
				x[i+1]=x[i];
				
			}
		}  return x;
		
	}

}
