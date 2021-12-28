package day26array3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {


		createArray(5);
		
	}
	
	
	public static int[] createArray(int arraySize) {
		
		Random rn= new Random();
		
		int[] myArray = new int[arraySize];
		
		for (int i=0; i<arraySize;i++) {
			
			myArray[i]= rn.nextInt(100);
			System.out.println(myArray[i]);
			
		}  return myArray;
	} 

}
