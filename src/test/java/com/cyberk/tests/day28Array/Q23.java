package day28Array;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {

		int [] x= {1,4,1,5,6,3,8,9};
		int [] y= {1,4,1,4};
		int [] z= {1};

		Array(x);
		Array(y);
    Array(z);	
		
	
	}
	
	public static void Array(int[] x) {
		
		for(int i=0;i<x.length;i++) {
			int k=0;
			x[i]=k+i;
		}
		System.out.println(Arrays.toString(x));
	}

}
