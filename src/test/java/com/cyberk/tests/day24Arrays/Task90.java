package day24Arrays;

public class Task90 {

	public static void main(String[] args) {

  String[] car= {"Porsche","Honda","Toyota","BMW","Mercedes","Audi"};
  boolean flag=false;
  for (int i=0; i<car.length;i++) {
	 
	  if(car[i]=="Honda") {
		  
		  flag=true;
		  
	  }
    

  }  
  
  if(flag) {
	  
	  System.out.println("Found it");
  }else { 
	  System.out.println("Not found it");
  }
  
	}
}
	
