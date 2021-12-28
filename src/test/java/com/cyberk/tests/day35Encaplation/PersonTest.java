package day35Encaplation;

public class PersonTest {

	public static void main(String[] args) {

Person p1= new Person("ziya", 50, 'M');

p1.getAge();

Person p2= new Person("n", 30,'M');



p1.setGender('f');p1.setName("Mike");
System.out.println(p1.getAge() +  " " + p1.getName());
		
	}

}
