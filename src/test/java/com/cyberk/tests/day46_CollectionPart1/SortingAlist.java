package day46_CollectionPart1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingAlist {

	public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("java");
      list.add("js");
      list.add("html");
      list.add("ruby");
      list.add("kotlin");
      list.add("c++");
      System.out.println("before sorting");
      System.out.println(list.toString());
      System.out.println("After sorting");
      Collections.sort(list);
      System.out.println(list.toString());
            
      List<Product> prodList=new ArrayList<>();
      prodList.add(new Product("spoon",13.99));
      prodList.add(new Product("bag",100.00));
      prodList.add(new Product("shoes",59.99));
      prodList.add(new Product("computer",2100.99));
      
      System.out.println("Befor Sorting");
      System.out.println(prodList.toString());
      // Collections.sort(prodList); it gives error because we must to implement for Product
      
      Collections.sort(prodList);
      System.out.println("After Sorting");
      System.out.println(prodList.toString());
      
      Product p1= new Product("spoon", 25.34);
      Product p2= new Product("shooes", 13.34);
      System.out.println(p1.compareTo(p2));
		
	}

}
