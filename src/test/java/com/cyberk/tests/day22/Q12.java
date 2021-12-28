package day22;



public class Q12 {

	public static void main(String[] args) {

       String str= "1cat1cadodog";
       boolean flag;
       int countcat=0,countdog=0;

		for (int i=0;i<str.length()-2;i++) {
			if(str.substring(i, i+3).equals("cat")) {
				countcat++; }

					if(str.substring(i, i+3).equals("dog")) {
					
					countdog++; }
					
					
				} if (countcat==countdog) {
					
					System.out.println(true);
					
				} else {
					System.out.println(false);


				}
					
				
				
			}

				
		
	

}

