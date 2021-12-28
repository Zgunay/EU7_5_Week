package day8;

public class Grades {

	public static void main(String[] args) {

int mark=80;
if (mark<60) {
	System.out.println("F");
	
} else if (mark >= 60 && mark<70) {
	System.out.println("D");

} else if (mark >=70 && mark<80) {
	System.out.println("C");
} else if (mark >=80 && mark<=89) {
	System.out.println(" B");
} else if (mark >=90 && mark<=100) {
	System.out.println(" A");
} else { 
	System.out.println(" Your grade is not between 0-100");
}
		
		
		
		
		
	}

}
