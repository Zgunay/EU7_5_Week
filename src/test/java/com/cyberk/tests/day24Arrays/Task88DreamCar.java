package day24Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task88DreamCar {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();
		String[] car= new String[7];
		car[0]="Honda"; 
		car[1]="Toyota";
		car[3]="BMW";
		car[2]="Nissan";  
		car[4]="Mercedes";
		car[5]="Porsche";
		car[6]="Ferrari";
		System.out.println("Enter your number beetwen 0-4");
		int index= sc.nextInt();
		
		if(index==0||index==1||index==2) {
			
			int price=0;
			System.out.println("Your car is " + car[index] + " "+(price=rn.nextInt((40000-20000)+1)+20000) + " price between 20000 and 40000");
			
		}else if (index==3||index==4) {
			System.out.println("Your car is " + car[index] + " price between 50000 and 80000");
	
			
		}else { 
			
			System.out.println("Your car is " + car[index] + " price between 100000 and 150000");
		}
		
		
		
		
		
		
	}

}
