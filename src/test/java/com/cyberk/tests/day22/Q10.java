package day22;

public class Q10 {

	public static void main(String[] args) {
		
	System.out.println(frontAgain("edited"));
	System.out.println(frontAgain("edite"));	
	System.out.println(frontAgain("ed"));	

				
	}
	
  public	static   boolean frontAgain(String str) {
		
	
if (str.length()<2) {
			
			return false;
		} else if(str.length()==2) {
			
			return true;
			
			} else if(str.equals(str.substring(0, 2))==str.equals(str.substring(str.length()-2,str.substring(str.length())))) {
			
			return true;
			
			
		} else { return false;
			
		}

  
		
	}
}
	
	
	


