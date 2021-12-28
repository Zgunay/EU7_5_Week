package day27arraypart4;

public class Q20 {

	public static void main(String[] args) {

int[] x= {1,2,2};
int[] y= {1,2,1,2};
int[] a= {2,1,2};
int[] b= {2,2,1,2};
System.out.println(Array(x));
System.out.println(Array(y));
System.out.println(Array(a));
System.out.println(Array(b));

	}
	
	public static boolean Array(int []  x) {
		
		for(int i=0;i<x.length-1;i++) {
			
			if(x[i]==2 && x[i+1]==2) {
				
				return true;
				
			} 
							
		}return false;
		
		}

}
