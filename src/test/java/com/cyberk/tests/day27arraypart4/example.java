package day27arraypart4;

import java.util.Arrays;

public class example {

	public static void main(String[] args) {

int[][] students= {{4,5,6},{12,5,7},{23,56,12,55,3}};

for (int[] num:students ) {
	
	for(int kak :num)
	
	System.out.println(kak);
	
	System.out.println(Arrays.toString(num));
}
		
		
	}

}
