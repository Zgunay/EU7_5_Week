package day27arraypart4;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {

int[]x = {4,5,6,9,4};		
	Array(x);	
	}
	
		public static void Array(int [] x) {
		
		int[] y= new int[2*(x.length)];
		
		y[y.length-1]= x[x.length-1];
		
		System.out.println(Arrays.toString(y));
	}

}
