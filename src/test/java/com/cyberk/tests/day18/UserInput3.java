package day18;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first number");
		
		int num1=sc.nextInt();
		
		System.out.println("Enter your second number");
		
		int num2=sc.nextInt();
		
        sc.nextLine();		
		System.out.println("Enter a string");
		

		String str=sc.nextLine();
		
		System.out.println("Output" + num1 +":" + num2+ ":" + str);
		
	}

}
