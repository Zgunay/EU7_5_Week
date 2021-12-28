package day28Array;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {

int[]  x= {2,10,3,4,20,5,100,6,30,4,7};
int[]  y= {10,1,20,1};
Arrays(x);
Arrays(y);
		
	}

	public static void Arrays(int[] x) {
		int k = 0;
		for(int i=0;i< x.length-1;i++) {
		
			if (x[i]%10==0 && x[i+1]%10!=0) {
			k=x[i]/10;	
			x[i+1]=k*10;	
				
			} else {
				
				x[i]=x[i];	
			}
						
			
		} System.out.println(Arrays.toString(x));
		
	}
	
	
}
