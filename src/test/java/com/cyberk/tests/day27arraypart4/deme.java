package day27arraypart4;

import java.util.Arrays;

public class deme {

	public static void main(String[] args) {


		int [] y= {1,2,2,6,99,99,4};
		int n=Arrays.binarySearch(y,4);
		int k=Arrays.binarySearch(y,7);
		System.out.println(y[y.length-1]);
	}

}
