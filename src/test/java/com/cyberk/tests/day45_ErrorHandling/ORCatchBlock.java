package day45_ErrorHandling;

public class ORCatchBlock {

	public static void main(String[] args) {

String str="abc";
try {
	System.out.println(str.toUpperCase());
}catch(IllegalArgumentException | NullPointerException e) {
	// Exception types can not be sub-parent types
	e.printStackTrace();
	
}
	}

}
