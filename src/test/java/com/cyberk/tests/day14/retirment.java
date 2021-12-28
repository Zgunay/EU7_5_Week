package day14;

public class retirment {

	public static void main(String[] args) {

		yearsuntilretirment("Mike",2000);
		
	}

	public static int calculateAge(int yearBirth) {
		
		return 2019-yearBirth;
	}
	
	public static void yearsuntilretirment( String name, int year) {
		
		int retiremntAge = 65- calculateAge(year);
		System.out.println(name + " retires in " + retiremntAge+ " years");
	}
}
