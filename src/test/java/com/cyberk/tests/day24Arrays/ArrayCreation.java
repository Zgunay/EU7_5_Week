package day24Arrays;

public class ArrayCreation {

	public static void main(String[] args) {

	int[]	scores= new int[5];
	scores[0]=80;
	scores[1]=85;
	scores[2]=86;
	scores[3]=90;
	scores[4]=100;
	System.out.println(scores[0]);
	System.out.println(scores[1]);	
	System.out.println(scores[2]);
	System.out.println(scores[3]);
	System.out.println(scores[4]);
	int avg=((scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5);
	System.out.println(avg);
	
	int[] point = {10,20,20,30,40,56,90,34,56,78,98,90,678,456,2345,66775,65456};
	int avge=0;
	
	for (int i=0; i<point.length;i++) {
		
		avge=avge+ point[i];
		
		
	} System.out.println("Average of numbers are " + (avge/point.length));
	
	}
	

}
