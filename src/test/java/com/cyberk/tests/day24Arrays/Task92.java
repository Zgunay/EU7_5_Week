package day24Arrays;

import java.util.Random;

public class Task92 {

	public static void main(String[] args) {


        int[] num= new int[10];
	
		
				
		for(int i=0;i<10;i++) {
			num[0]= 19;
			num[i] = (i+1)*num[0];
			System.out.println("num["+i+"] = "+ num[i]);
			
		}

		

	}

}
