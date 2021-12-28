package day17_classObjekt;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {


int b1;
do {  
Scanner sc= new Scanner(System.in);

System.out.println(" Enter a byte value between 1 to 127 : "  + " Programi bitirmek isterseniz 0 giriniz");
 
byte a1= sc.nextByte();
if ((a1==0)) { System.out.println("finish");

break;
	
} else {

 
System.out.println(a1);
System.out.println(a1*4);
System.out.println(a1%3);
}
b1=a1;
} while(b1<=127);	
	
}
}



