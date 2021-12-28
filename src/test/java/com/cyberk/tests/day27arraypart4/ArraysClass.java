package day27arraypart4;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

int[] nums= {1,3,23,12,5};


System.out.println(nums[0]);
//Arrays.sort(nums);
//System.out.println(Arrays.toString(nums));

int[] n = Arrays.copyOf(nums, 4);
System.out.println(nums);

		
	}

}
