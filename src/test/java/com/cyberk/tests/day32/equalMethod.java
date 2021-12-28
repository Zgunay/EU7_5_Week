package day32;

import java.util.ArrayList;

public class equalMethod {

	public static void main(String[] args) {

ArrayList<String> a= new ArrayList<>();
ArrayList<String> b= new ArrayList<>();
a.add("Ahmet");
a.add("Mehmet");

b.add("Mehmet");
b.add("Ahmet");


if(a.equals(b)) {
	
	System.out.println(true);
} else {System.out.println(false);

		
		
	}
System.out.println(a);
System.err.println(b.toString());
}
}
