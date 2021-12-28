package day20;

import java.util.Scanner;

public class task82 {

	public static void main(String[] args) {



Scanner scr= new Scanner(System.in);
System.out.println("Enter your username");
String user=scr.nextLine();

System.out.println("Enter your password");
String pass=scr.nextLine();
String Ausername= "ziya ";
String Apassword= "günay";
boolean username=user.contains(" ");
boolean password=pass.contains(" ");

if((username)&(password)) {
	System.out.println("Username and password  can not be empty");		
} else if (username==true & password==false) {
	System.out.println("Username is not empty");
} else if (username==false & password==true) {
	System.out.println("Password is not empty");

} 
		


		
	}
	
	
	}



