package day10loop;

public class ne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumeven=0,sumodd=0;
		
		for(int i=0;i<100;i+=1) {
			if (i%2==0) {
				sumeven=sumeven+i;
				
			} else { sumodd=sumodd+i;

			}
			
			}
		System.out.println(sumeven);
	System.out.println(sumodd);	

}
}
