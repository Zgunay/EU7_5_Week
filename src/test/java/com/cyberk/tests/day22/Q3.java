package day22;

public class Q3 {

	public static void main(String[] args) {

	System.out.println(extraEnd("Hello"));	
	System.out.println(extraEnd("b"));
	System.out.println(extraEnd("Hi"));
		
	}
	
	public static String extraEnd(String str) {
		
		if (str.length()<2) {
			return "Invalid";
		}
		String str1= str.substring(str.length()-2);
		
		return str1.concat(str1).concat(str1);
	}

}
