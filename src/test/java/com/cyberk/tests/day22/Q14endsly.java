package day22;

public class Q14endsly {

	public static void main(String[] args) {


		String str="oddkkkkdmmnndly";
		
		if(str.length()<2) {
			
			System.out.println(false);
			return;
		} else if(str.substring(str.length()-2).equalsIgnoreCase("ly")) {
			
			System.out.println(true);
			
			
		}else { 
			System.out.println(false);
		}
		
	}

}
