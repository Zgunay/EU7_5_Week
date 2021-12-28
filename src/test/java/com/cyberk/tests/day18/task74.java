package day18;

import java.util.Scanner;

import day8.ifelse;

public class task74 {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int sum=0;

do { System.out.print("Enter your number : ");
 int num=sc.nextInt();
 
 if ((num>0)) {  sum=sum+num; continue;
	
} else { break;

}	
	
} while(true);
		
	System.out.println(" Sum= " + sum);	
	}

}
