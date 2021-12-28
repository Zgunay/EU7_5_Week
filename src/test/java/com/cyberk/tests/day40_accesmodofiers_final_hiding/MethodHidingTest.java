package day40_accesmodofiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		

	}

}

class Bear {
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Pand extends Bear {
	
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	/*
	public  void sneeze() {     
		System.out.println("Panda is sneezing");
	}   
	
	/* burada static olmadigi icin hata veriyor. static oldugu zaman hiding olur.
	 asagidaki oveeriding static degil.
	*/ 
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}
