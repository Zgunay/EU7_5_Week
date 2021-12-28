package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {

ArrayList<String> names = new ArrayList<>();
ArrayList<Integer> nums = new ArrayList<>();

names.add("Mike");
names.add("Smith");
names.add("Ziya");

nums.add(99);
nums.add(656);

System.out.println(names.get(0));
System.out.println(names.size());
System.out.println(names.toString());
System.out.println(names.get(0) + " " + names.get(names.size()-1));

 


	}

}
