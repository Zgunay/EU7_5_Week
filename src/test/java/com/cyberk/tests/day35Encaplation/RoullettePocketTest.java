package day35Encaplation;

import java.util.Scanner;

public class RoullettePocketTest {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
System.out.println("eNTER YOUR POCKET NUMBER: ");

RoulettePocket rp= new RoulettePocket(sc.nextInt());

while(rp.getPocketColor().equalsIgnoreCase("invalid")) {
	
	System.out.println("Enter your Number");
	rp.setPocketNumber(sc.nextInt());
	
}

System.out.println(rp.getPocketColor());
		
	}

}
