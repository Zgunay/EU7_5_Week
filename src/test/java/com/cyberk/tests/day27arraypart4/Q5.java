package day27arraypart4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

int[] x = {1,2,3};
int[] y= {17,12,10,8};
int []a= { 7,0,0};

   Array(x);
   Array(y);
   Array(a);
   System.out.println(Arrays.toString(Array(y)));



	}
	
	public static int [] Array(int [] x ) {
		
		int[]y= Arrays.copyOf(x, x.length);
		for(int i=1; i<x.length;i++) {
			y[i-1]=x[i];
			}
		
		y[y.length-1]= x[0]; 
		
	
		
		return y;
	}

}// System.out.println(Arrays.toString(y));
