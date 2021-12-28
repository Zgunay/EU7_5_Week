package Aufgabe;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

//Q2
	double width=4.5,area;
	double height=7.9;
	area=width*height;
	System.out.println(area);
	
//Q3 
	
	int n1=10;
	int n2=20;
	int n3;
	
	n3=n1;
	n1=n2;
	n2=n3;
	System.out.println("new value of n1 :" +n1);
	System.out.println("new value of n2 :" +n2);

//Q4
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter coins");
	int x=sc.nextInt();
	int y;
	y=100-x;
	int q,d,n,p;
	q=y/25;
	d=(y%25)/10;
	n=((y%25)%10)/5;
	p=((y%25)%10)%5;
	System.out.println("You will take from machine ;"+ q+ " quarters "+ d+" dimes "+ n+" nickel  "+ p+" penny ");
	}

}
