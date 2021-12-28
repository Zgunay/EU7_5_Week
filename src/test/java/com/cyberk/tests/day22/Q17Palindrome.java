package day22;

public class Q17Palindrome {

	public static void main(String[] args) {

 String str="top spot";
 String str1="";   
for (int i=0; i<str.length(); i++) {
							
			str1= str1+str.substring(str.length()-1-i, str.length()-i);
			
	}
         if(str1.contentEquals(str)) {
		System.out.println("Palindrome");
	} else {
		
		System.out.println("Not");
	}
	
	
	
}
}