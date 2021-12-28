package day27arraypart4;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
int[] x= {1,2,3,4};

System.out.println(Arrays.toString(Array(x)));
		
		
	}
	
	
	public static int[] Array(int[] x) {
		
		int[]y= Arrays.copyOf(x,x.length);
		y[0]=x[x.length-1];
		y[y.length-1]= x[0];
		
		return y;
		
		
		
		
	}

}
