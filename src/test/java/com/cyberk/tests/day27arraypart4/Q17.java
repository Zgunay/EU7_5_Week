package day27arraypart4;

public class Q17 {

	public static void main(String[] args) {

int [] x= {10,3,5,6};
int [] y= {7,2,10,9};
int [] z= {2,10,7,2};

System.out.println(Array(x));
System.out.println(Array(y));
System.out.println(Array(z));
		
		
	}
	
public static int Array(int[] x) {
	
	int max= x[0];
	int min= x[0];
	int dif = 0;
	for (int i=0; i<x.length;i++) {
		
		if (x[i]>max) {
			
		max=x[i];
		}else if (x[i]<min) {
			
			min=x[i];
		}
		dif=max-min;
		
		}
	return dif; 
}
}
