package day30;

public class varArgs {

	public static void main(String[] args) {

sum(2,4);
sum(2,3,5,6);
		

	}

	
	public static void sum(int...numbers) {
		
		int k=0;
		for(int value:numbers) {
			
			k=k+value;
			
		}
		System.out.println(k);
	}
}
