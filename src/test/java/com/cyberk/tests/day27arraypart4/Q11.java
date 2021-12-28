package day27arraypart4;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

int[] x= {1,2,3};
int[] y= {2,3,3};
int[] z= {1,2,1};
int[] a= {11,2,13,3,2};

Array(y);
Array(z);
Array(a);
System.out.println(Arrays.toString(Array(x)));
	}
	
	
	public static int[] Array( int x[]) {
		
		for(int i=0 ; i<x.length-1; i++) {
			
			if (x[i]==2 && x[i+1]==3) {
				
				x[i+1]=0;
				
			}
			
		} return x;
		
	}

}
