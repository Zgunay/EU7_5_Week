package day37Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
        int grade,miss;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your nummer of questions");
		grade=sc.nextInt();
		System.out.println("Enter your missed questions ");
		miss=sc.nextInt();
		
		FinalExam f1= new FinalExam(grade, miss);
		System.out.println(f1.getGrade());
		
		
	}

}
