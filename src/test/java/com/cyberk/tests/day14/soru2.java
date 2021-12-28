package day14;

public class soru2 {

	public static void main(String[] args) {

soru2(6,4);
soru2(4,5);
soru2(1,5);
soru2(6,12);

	}
	
	public static void soru2(int num1, int num2) {
		
		if (num1==6 || num2==6|| num1-num2==6||num2-num1==6 || num1+num2==6) {

		System.out.println("true");
		} else {System.out.println("false");

		}
		
				
	}

}
