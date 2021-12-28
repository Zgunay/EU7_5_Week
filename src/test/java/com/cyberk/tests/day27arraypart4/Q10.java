package day27arraypart4;

public class Q10 {

	public static void main(String[] args) {


		int [] x= {2,4,6,2,7,2};
		
		System.out.println(Array(x));
		
	}
	
	
	public static String Array(int[] x) {
		
		int count1=0;
		int count2=0;

		for(int value: x) {
			
			if(value==2) {
				count1++;
				
				
			}else if(value==3) 
				count2++;

						
		} if(count1==2 || count2==2) {
			
			return "true";
		}else  return "false"; 
						
	}

}
