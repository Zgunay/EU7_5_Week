package day40_accesmodofiers_final_hiding2;

import day40_accesmodofiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c= new Car();
//		c.model="M3"; not accessible it is not same package
		c.year=2019;
//		c.door= 4; not accessible it is private
//		c.engine=5.3; not inheritance , so different package.
		
		System.out.println(c);
	}

}
