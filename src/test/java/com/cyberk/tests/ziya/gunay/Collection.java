package ziya.gunay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection {

		public static void main(String[] args) {
		    
	        ArrayList<Character> list = new ArrayList<>();
	        
	        list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
	        
	        System.out.println(list.size());
	        System.out.println(list);
	        Collections.reverse(list);
	        System.out.println("Reversed list: "+ list);

	    }

	}


