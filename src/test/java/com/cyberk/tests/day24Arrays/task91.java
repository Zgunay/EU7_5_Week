package day24Arrays;

import java.util.Random;

public class task91 {

	public static void main(String[] args) {


		int[] num= new int[10];
		
		Random rn= new Random();
		
		for(int i=0;i<10;i++) {
			
			num[i] = rn.nextInt(99);
			System.out.println("num["+i+"] = "+ num[i]);
			
		}
		
		
	}

}
