package day14;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		String a = null;
		do {
		System.out.println("Lütfen sayinizi giriniz");
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
	    prime(k);
		System.out.println("Devam etmek istiyor musunuz? Y  /  N");
		sc.nextLine();
		a=sc.nextLine();
		} while(a.equalsIgnoreCase("Y"));
		System.out.println("Iyi günler");
		
	}
	
	public static void prime(int k) {
		
		if (k==0 || k==1) {System.out.println( k+ " is not prime number");
		}
			
		 if(k==2) {System.out.println(k+  " is prime number");
			}
		 int m=0;
		
	for (int i=1 ;i<=k;i++) {
		if(k%i==0) {
			m++;
		} 
			}
	
		if (m==2) {
			System.out.println(k+ " is prime number");
		} else {
			System.out.println(k+" is not prime number");
		}
			}

}
