package day14;

import day12_controlloops.label;

public class PrimeNumber {

	public static void main(String[] args) {

 prime(389);
 
	}	

	public static void prime(int z) {
		
		
	int i,k,m,n;
	if (z==0 || z==1) {System.out.println( " is not prime number");
	}
		
	 if(z==2) {System.out.println( " is prime number");
		}
			
 label outer;
 for (i=2;i<z;i+=1) {
		for(k=i;k<z;k+=1) {
			m=z % k;
			
			if (m==0) { System.out.println("  is not prime number" );
				
			break outer;	
			
			} else {System.out.println( " is prime number");
			break;
		}
	
	
		}
 }
	}
}
 
	
 
 

		
 
	


