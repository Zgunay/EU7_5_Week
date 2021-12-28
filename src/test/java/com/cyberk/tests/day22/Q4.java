package day22;

public class Q4 {

	public static void main(String[] args) {

System.out.println(firstTwo("Hello"));
System.out.println(firstTwo(" "));
System.out.println(firstTwo("abcdefg"));

		
	
	}	
	
	public static String firstTwo(String str) {
		
		
		if ((str.length()<2 && str.length()>0)) {
			return str;
			
		} else if(str.isEmpty()) {  
			return " ";

		}
		
		return str.substring(0, 2);
		
		
		
	}
}
		
//	}
		
//		if (str.length()<2 && str.length()>0) {
//			return str;
//			
//		} else { return "";
//
//		
//		 
//	} {
//	
//	
//	}
    
		



		
		
	
	
	
	
		
	



