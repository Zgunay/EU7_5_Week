package Aufgabe;

import java.util.Scanner;

public class GallonConvert {

	public static void main(String[] args) {
		double liter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your gallons value");
		double gallon= sc.nextDouble();
		liter=gallon*3.7854;
		System.out.println(gallon+" gallon" + " is equal to "+ liter + " liter");
		
	}

}
