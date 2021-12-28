package day27arraypart4;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

  int [] x= {1,2,6,2,76,1};
  
 System.out.println(Arrays.toString(Array(x)));
  	
		
	}
	
	
	public static  int [] Array( int [] x) {
		int [] y= new int [x.length];
		int max = x[0];
		for(int i=0; i<x.length-1; i++) {
        if (x[i]>max) {
        	
        	max=x[i];
        } 

						
		}for (int k=0; k<x.length;k++) {
			
			x[k]=max;
			
		} return x;
		
				
		}
	}


