package day18;

public class removeDup {

	public static void main(String[] args) {

	System.out.println(removeDup("ankara"));	
		
	}
	public static  String  removeDup( String  str) {

		String result = "";

		    for (int i = 0; i < str.length(); i++)

		        if (!result.contains("" + str.charAt(i)))

		        result += "" + str.charAt(i);

		 

		    return result;

		}

}
