package day28Array;

public class q24 {

	public static void main(String[] args) {

int[] x= {1,2,1,4};
int a=2;

int[] y= {1,2,1,3};
int b=1;	
Array(x,a);
Array(y,b);

	}
	
	public static void Array(int[] x, int a) {
		int count=0;
		
		for(int i= 0; i<x.length;i++) {
			
			if(x[i]==a) {
				
				count++;
			}
		} if(count==2) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		}

}
