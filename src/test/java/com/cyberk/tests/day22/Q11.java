package day22;

public class Q11 {

	public static void main(String[] args) {

	System.out.println(countHi("abc hi ho"));	
	System.out.println(countHi("ABChi hi"));	
	System.out.println(countHi("hihi"));		
	}

	public static int countHi(String str) {
		
		
		if (str.contains("hi")) {
			
			return 1;
				
		} else if(str.contains("hi hi")) {
		
		return 2;
		
		} return 0 ;
		
		
		
	}
	
	
	
}
