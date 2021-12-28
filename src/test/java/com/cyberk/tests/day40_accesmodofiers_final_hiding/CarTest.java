package day40_accesmodofiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {

	Car c= new Car();
	c.model="M3";
	c.year=2019;
//	c.door= 4; not accessible it is private
	c.engine=5.3;

	}

}
