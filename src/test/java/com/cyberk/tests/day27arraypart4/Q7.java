package day27arraypart4;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

int[] x= {1,2,3};
int[] y = {};
int [] a= {7,4,6,2};
int [] b= {};

System.out.println(Arrays.toString(Array(a,b)));
System.out.println(Arrays.toString(Array(x,y)));
		
	}
	
	public static int[] Array(int []a, int[] z) {
		int[]m= Arrays.copyOf(a, 2);
		m[0]=a[0];
		m[1]=a[a.length-1];
		
		
		return m;
		
	}
	
	}
