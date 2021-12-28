package day14;

public class prime {

	public static void main(String[] args) {

  
		if (prime(98)==false) {System.out.println("Not");
			
		} else { System.out.println("yes");
	}
	}

	public static boolean prime(int z) {
		
		boolean flag= true;
		
		if (z==0 || z==1) {

			flag=false;
		} else { 
			
			
			for( int i=2; i<z;i++) {
				
				if (z%i==0) {
					
					flag= false;
					break;
				}
			}
		}
		
		return flag;
	}
	
	
}
