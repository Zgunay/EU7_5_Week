package day22;

public class Q6 {

	public static void main(String[] args) {

	System.out.println(withoutEnd("Hello"));	
	System.out.println(withoutEnd("ja"));	
	System.out.println(withoutEnd("coding"));	
	
		
	}
	
	static public String withoutEnd(String str) {
		if (str.length()<=2) {
			
			return "INVALID";
			
		} else {

		} return str.substring(1, str.length()-1);
		
	
		
		
	}

}
