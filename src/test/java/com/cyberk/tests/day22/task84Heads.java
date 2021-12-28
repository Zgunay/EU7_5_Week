package day22;

import java.util.Random;


public class task84Heads {

	public static void main(String[] args) {

    int num1,num2=0;
while(num2<10) {
	
	
	Random rn= new Random();
	num1= rn.nextInt(2);
	if(num1==1) {
	System.out.println("Tails");	
		
	}else {
		
		System.out.println("Heads");
	} num2++;
	
}
	
	
		
	}

}
