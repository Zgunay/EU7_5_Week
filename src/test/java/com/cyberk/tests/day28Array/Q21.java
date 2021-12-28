package day28Array;

public class Q21 {

	public static void main(String[] args) {

int [] x= {2,3,2,4,2,2};
int [] y= {2,3,2,2,4,2,2};
int [] z= {1,2,3,4};

System.out.println(Array(x));
System.out.println(Array(y));
System.out.println(Array(z));
		
	}
	
	
	public static String Array(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			
			if (x[i]==2) {
				
				sum=sum+x[i];
			}
		} if (sum==8) {
			
			return "True";
		}else return "false";
	}

}
