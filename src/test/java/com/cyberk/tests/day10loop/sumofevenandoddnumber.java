package day10loop;

public class sumofevenandoddnumber {

	public static void main(String[] args) {

		int sumeven=0,sumodd=0;
		for(int i=0;i<100;i+=i) 
			if (i%2==0) {
				sumeven=sumeven+i;
				
			} else { sumodd=sumodd+i;

			}
			
		
	System.out.println(sumeven);
	System.out.println(sumodd);	
					
		
	}

}
