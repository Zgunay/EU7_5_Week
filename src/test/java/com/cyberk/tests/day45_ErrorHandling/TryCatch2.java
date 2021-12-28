package day45_ErrorHandling;

public class TryCatch2 {

	public static void main(String[] args) {
		int[] nums= {36,6,34,12};
	//System.out.println(nums[]); //compile error  no handling

		try {
			System.out.println(nums[6]);
						
		}catch (Exception e) {
			
	e.printStackTrace();
	System.out.println(e.getMessage());
			
		}
		
		try {
			int j=100;
			int n=j/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
