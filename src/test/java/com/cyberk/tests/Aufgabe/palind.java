package Aufgabe;

import java.util.Scanner;

public class palind {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		  }
		  
		  public static void isPalindrome(int num){
			  int k=0,b,c;
			  int y=1;
			  b=num;
			  c=num;
					while(num!=0) {
						num=num/10;
						k++;
					}
					for(int i=1;i<k;i++) {
						
						y=10*y;
					}
			  
			 int r,m=0;
		  r=b%10;		 
		  m=y*r;
		 b=b/10; 

		while(b!=0){
		 r=b%10;
		 y=y/10;
		 m=y*r+m;
		b=b/10;
		} ;
		 if(m==c){
		   System.out.println(m+" is a palindrome number ");
		 } else {

		System.out.println(m+" is not a palindrome number ");                  
			}  

			
	}

}
