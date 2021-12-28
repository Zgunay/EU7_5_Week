package day25arraypart2;

import java.util.Scanner;

public class passArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double sum=0.0,avg=0.0;
		String[] month= {"Jan","Feb","March", "April","May","June","july","August","Semp","Octo","Nov","Dez"};
		double[] val= new double[11];
		double max = 0.0,min=0.0,m=0,n=0;
		for ( int i=0;i<11;i++) {
		System.out.println(month[i]+"= " + "Enter Rainfall value greater than or equal 0");	
			double index= sc.nextDouble();
			val[i]=index;
			sum= sum+index;
			avg=sum/12;
			max=val[0];
			m=val[i];
			if (m>max) {
				
				n=m;
				max=n;
			}
			
		 
		
	}System.out.println(sum);
	System.out.println(avg);
	for(double k:val) {
		System.out.println("yeni Array" + k);
		
		
	} System.out.println(n);
	  System.out.println(min);
	
	


		
		
		
		
	}
	
	
	

}
