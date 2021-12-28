package day14;

public class distance {

	public static void main(String[] args) {

  System.out.println(distance(80,2));
  int a;
  a= distance(90,6);
	System.out.println(a);	
		
	}
	
	public static int distance(int speed, int time) {
		
		int distance;
		distance= speed*time;
		return distance;
		
	}
	

}
