package day22;

import java.util.Random;
import java.util.Scanner;





public class oyun {

	public static void main(String[] args) {


//		    int dice1;
//			int dice2;
//			String again="y";
//			
//			Scanner sc= new Scanner(System.in);
//			Random rn= new Random();
//			
//			while(again.equalsIgnoreCase("y")) {
//				
//				System.out.println("Rolling the dice....");
//							
//				dice1=rn.nextInt(6)+1;
//				dice2=rn.nextInt(6)+1;
//				System.out.println("Their values are: ");
//				System.out.println(dice1 + " " + dice2);
//				
//				System.out.println("Roll them again (y= yes)");
//				again=sc.nextLine();
		
		int dice1;
	    int dice2;
	    String again="y";
		
		Scanner sc=  new Scanner(System.in);
		Random rn=new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			System.out.println("Computer dice....");
			
			dice1=rn.nextInt(6)+1;
			System.out.println(dice1);
			System.out.println("To see your dice please enter");
			sc.nextLine();
			dice2=rn.nextInt(6)+1;
			System.out.println(dice2);
			if (dice1<dice2) { 
				System.out.println("You won");
			
			}else {System.out.println("Computer won");
			sc.nextLine();			
			}
			System.out.println("Roll them again (y= yes)");
			again=sc.nextLine();
			}
		
		
		
		
	}

}

