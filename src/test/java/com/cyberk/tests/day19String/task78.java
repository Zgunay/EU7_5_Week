package day19String;

public class task78 {

	public static void main(String[] args) {

		String str="abcabqcabc";
		
		String str1="a";
		int count=0;
		
		for ( int i=0; i< str.length(); i++) {
			
			if (str1.charAt(0)==str.charAt(i)) {
				
				count+=1;
			} 
						
				
		} System.out.println("Number of "+ str1 + " in this string is :" + count);
		
		
	}

}
