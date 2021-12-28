package day27arraypart4;

import java.util.Arrays;

public class Loop2dArrays {

	public static void main(String[] args) {

  int [][] numbers= {{1,2,3}, {4,5},{7,8,9}};
  
  for( int i=0; i<numbers.length;i++) {
	   
	  for (int k=0; k<numbers[i].length;k++) {
		  
		  System.out.println(i+1+ ".row elements= " + numbers[i][k]);
	  }
  }
	for(int[] num: numbers)
	{
		 System.out.println(Arrays.toString(num));
	}
 
		
		
	}

}
