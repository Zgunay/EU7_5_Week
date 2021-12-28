package day22;

public class Q9 {

	public static void main(String[] args) {

		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
		
		
	}
	
	
	static public String right2(String str) {
		
		
if (str.length()<2) {
			
			return "invalid";
		} else if(str.length()==2) {
			
			return str;
			
		} else { 
			return str.substring(str.length()-2, str.length()).concat(str.substring(0, str.length()-2));
		
	}


	}
}
