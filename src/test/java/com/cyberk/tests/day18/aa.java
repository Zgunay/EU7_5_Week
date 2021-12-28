package day18;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mermmmerdmm";
		
		int m=1;
		do {
				for(int i=m; i<(str.length());i++) { 
					
 			if(str.charAt(m-1)==str.charAt(i)) {
				
				System.out.println(str.charAt(i));
	
		break;
									      
		} else continue;
 				
	
				}				



		}while (m++<str.length());
	}

}
