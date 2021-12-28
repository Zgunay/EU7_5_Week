package day15;

public class lastdigit {

	public static void main(String[] args) {

	if (lastdigit(7,17)) { System.out.println("Same digit");
		
	}else {System.out.println("Not same");
		
	}
		
	}
	
	public static boolean lastdigit(int a, int b) {
		
		if(a%10==b%10) {
			
return true;
} else {

	return false;
		}
		 
	}
}


