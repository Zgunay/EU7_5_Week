package day18;

import java.util.Scanner;





public class ChangeMaker {

	public static void main(String[] args) {

	for (int i=1;i<4;i++) {
		
	   Scanner sc= new Scanner(System.in);
		System.out.println("Enter"+ i+".number");
		int num= sc.nextInt();
		
	
		
		
	}
		

	}	
	
	
	public static void chg(int num) {
		int b1, c1, c2, b2;	
		b1=num/25;
		c1=(num-b1*25)/10;
		c2=(num-c1*10-b1*25)/5;
		b2=num-(b1*25+c1*10+c2*5);	
		System.out.println("num is="+ b1+ " quarter " +  " and  " + c1+ " dimes " + c2+ " nickles " + b2+  " pennies");
		
		}
	

}
