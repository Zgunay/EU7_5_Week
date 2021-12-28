package day27arraypart4;

public class Q16 {

	public static void main(String[] args) {

int[]x = {2,1,2,3,4};
int[]y = {2,2,0};
int[]z = {1,2,3,5};

System.out.println(Array(x));
System.out.println(Array(y));
System.out.println(Array(z));
		
			
	}
	
	public static int Array(int[] x) {
		int count=0;
		for(int value:x) {
			
			if(value%2==0) {
				
				count++;
			}
		} return count;
		
		
	}

}
