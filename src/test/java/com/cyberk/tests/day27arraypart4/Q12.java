package day27arraypart4;

public class Q12 {

	public static void main(String[] args) {

int[]x = {1,2,3};
int[]y= {1,3};

System.out.println(Array(x,y));
		
	}
	
	public static int Array(int [] x, int[] y) {
	int count=0;
	
	
		
		if (x[0]==1) {
			count++;
			
		}  if(y[0]==1) {
			
			count++;	
		}
	
		
		
		return count;
				
	}

}
