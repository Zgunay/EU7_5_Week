package day18;

import java.util.Scanner;

public class tas73 {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
 int i= 11;
 do { 
	 System.out.println(" Enter your number"); 
	 int num=sc.nextInt();
	 if ((num==i)) { System.out.println("Congrat, you got it");
	 break;
		
	} else if(num>i) {System.out.println(" your number is large");
	continue;
	
	}else {System.out.println(" your number is small");
	
	continue;
	}
 	 
 }while(i==11);
 

		
	}

}
