package day28Array;

public class Q19 {

	public static void main(String[] args) {

		int [] y= {1,2,2,56,6,99,7,9,10};
		Array(y);
		
	}
	
	public static void Array(int[] x) {
		int sum=0;
		boolean flag=true;
		for(int i=0; i<x.length;i++) {
			
			if(flag) {
				
				if(x[i]!=6) {
					
					sum=sum+x[i];
				}else if (x[i]==6) {
					
					flag=false;
				}
				
				}else if(x[i]==7)  {
				
				flag=false;

			}
			
		} System.out.println(sum);
		
		
		
	}

}
