package day40_accesmodofiers_final_hiding;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
	final	ArrayList<String> COLORS= new ArrayList<>();

		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		System.out.println(COLORS);
		
		
//		COLORS= new ArrayList<String>();   final kullanildigi icin hata verir.
		
	}

}
