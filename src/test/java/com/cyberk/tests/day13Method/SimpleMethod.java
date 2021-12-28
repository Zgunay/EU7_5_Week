package day13Method;

public class SimpleMethod {

	public static void main(String[] args) {
		
displayMethod();

	}
	
	public static void displayMethod () {
		double miles=10,kms=10;
		if (miles>kms) {System.out.println("Greater number ist " + miles);
			
		} else if(kms>miles) {System.out.println("Greater number ist " + kms);

		}else
			System.out.println("two number ist equal " + miles +" = " + kms);
	}
	
	

}
