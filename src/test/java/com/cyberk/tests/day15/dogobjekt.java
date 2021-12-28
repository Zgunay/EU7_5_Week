package day15;

public class dogobjekt {

	public static void main(String[] args) {

dog dog1=new dog();
dog dog2=new dog();
dog dog3=new dog();

dog1.age=10;
dog1.color="Red";
dog1.name=("Rover");


System.out.println(dog1.age);
System.out.println(dog1.color);
System.out.println(dog1.name);

dog1.getInfo();


	}

}
