 package day22;

public class String_isempty {

	public static void main(String[] args) {

String a= "Ziya";

 
if (a.startsWith("Mr.")) {
	
	System.out.println("married man"); 
	
	} else if(a.startsWith("Mrs.")) {
		
		System.out.println("married woman");
	} else if (a.startsWith("Ms.")) {
		
		System.out.println("some woman");
	}else if(a.startsWith("Dr.")) {
		
		System.out.println("Doctor man or woman");
			
		
	}else System.out.println("Unknown Status");

}
}
