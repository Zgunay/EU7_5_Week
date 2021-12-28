package day47_Collection_Part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LoopSet {

	public static void main(String[] args) {
		Set<Integer> numset= new HashSet<>();
		numset.add(50);
		numset.add(543);
		numset.add(1150);
		numset.add(550);
		numset.add(570);
		numset.add(93);
		numset.add(5000);
		numset.add(950);
		
		for(Integer n: numset) {
			
			System.out.print(n+"|");
		}
		
		System.out.println();
		
		numset.forEach(n-> System.out.print(n+"|"));
	}

}
