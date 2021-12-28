package day25arraypart2;

import java.util.Scanner;

public class payArray {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		int[] hour= new int[4];
		System.out.println("Enter first empl hour");
   	    int index1= sc.nextInt();
   	    System.out.println("Enter second empl hour");
    	int index2= sc.nextInt();
    	System.out.println("Enter third empl hour");
    	int index3= sc.nextInt();
    	System.out.println("Enter fourth empl hour");
    	int index4= sc.nextInt();
    	System.out.println("Enter fifth empl hour");
    	int index5= sc.nextInt();
    	
    	System.out.println("First emp pay= "+ (index1*25));
    	

	}

}
