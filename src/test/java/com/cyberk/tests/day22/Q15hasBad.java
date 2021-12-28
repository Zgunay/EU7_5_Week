package day22;

public class Q15hasBad {

	public static void main(String[] args) {

		String str="xgggggghhhhhhhhhhkkkkkkkkkköööööööööööö";
		
		if(str.length()<3) {
			
			System.out.println(false);
			return;
			
		} if((str.substring(0,3).equalsIgnoreCase("bad")) || str.substring(1, 4).equalsIgnoreCase("bad")){
			
			System.out.println(true);
			
		}else {
			
			System.out.println(false);
		}
		
		
	}

}
