package day39_inheritance_review_access_modifier;

public class ToyotaTest {

	public static void main(String[] args) {

		Toyota toyota = new Toyota(36);
		toyota.steer(45);
		toyota.accelerate(30);
		toyota.accelerate(20);
		toyota.accelerate(-42);
	System.out.println(toyota.getWhells());
		
	}

}
