package day27arraypart4;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {

int[]x= {1,2,7,9};
int[] y = {3,4};
Array(x,y);
System.out.println(Arrays.toString(Array(x,y)));
		
	}
	
	public static int[] Array(int[] x, int[] y) {
		int[]z= new int[x.length+y.length];
      for(int i=0;i<x.length;i++) {
    	 z[i]=x[i];
    	  
    	} for(int k=0;k<y.length;k++) {
    		
    		z[x.length+k]=y[k];
    		
    	} return z;

				
	}

}
