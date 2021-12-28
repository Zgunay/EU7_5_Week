package day22;

public class Q13doublechar {

	public static void main(String[] args) {

		String str= "Akkljh";
		String str2 ="";
		
		
		
		for(int i=0; i<str.length();i++) {
			
          str2= str2+str.substring(i, i+1  ).concat(str.substring(i, i+1  ));
				
								
					
		} System.out.println(str2);
		
		
	}

}
