package day22;

public class Q7 {

	public static void main(String[] args) {

		
	System.out.println(comboString("Hello","hi"));	
	System.out.println(comboString("hi","Hello"));	
	System.out.println(comboString("aaa","b"));	
	
		
	}
	
	
	static public String comboString(String str1, String str2) {
		
		if (str1.length()<str2.length()) {
			return str1.concat(str2).concat(str1);
			
		} else { return str2.concat(str1).concat(str2);


		}
		
		
	}
	

}
