package day27arraypart4;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {

int [] x= {1,2};
int [] y= {3,4};
int [] a= {5,6};
int [] b= {3,8};
int [] c= {1,1};
int [] d= {1,0};
Array(x,y);
Array(a,b);
Array(c,d);
		
	}
	
	
	public static void Array(int[] x, int[]y) {
		int sum=0;
		int sum1=0;

		for(int value:x) {
			sum=value+sum;
		} for(int value1:y) {
			sum1=sum1+value1;
		}
		if (sum>sum1) {
			System.out.println(Arrays.toString(x));
		}else if (sum1>sum) {
			System.out.println(Arrays.toString(y));
		}else {
			System.out.println("equal");
		}
	}

}
