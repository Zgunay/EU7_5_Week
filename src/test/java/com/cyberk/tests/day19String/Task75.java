package day19String;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
		
//	System.out.println(" Enter your name");
		
//		String a=sc.nextLine();
		
//		System.out.println(" Enter your surname");
		
//		String b=sc.nextLine();
//		System.out.println("Your name length is :" + a.length());
//		System.out.println("Your surname length is :" + b.length());
//		System.out.println("------------------- :" + a.charAt(0));
		String str="Cybertek";
//		System.out.println("1. character is :" + str.charAt(0));
//		System.out.println("2. character is :" + str.charAt(1));
//		System.out.println("3. character is :" + str.charAt(2));
//		System.out.println("4. character is :" + str.charAt(3));
//		System.out.println("5. character is :" + str.charAt(4));
//		System.out.println("6. character is :" + str.charAt(5));
//		System.out.println("7. character is :" + str.charAt(6));
//		System.out.println("8. character is :" + str.charAt(7));
		int m=0;
		do {
				for(int i=1; i<=(str.length());i++) {
					
			if (str.charAt(m)==str.charAt(i)) { 
				
				System.out.println(str.charAt(m));
			} m+=1;
			
			      
				} 
	
				

} while ((m+=1)<=str.length());
}
}
