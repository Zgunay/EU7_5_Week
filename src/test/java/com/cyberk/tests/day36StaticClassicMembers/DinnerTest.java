package day36StaticClassicMembers;

public class DinnerTest {

	public static void main(String[] args) {
Dinner mom = new Dinner();
Dinner kid= new Dinner();
Dinner dad= new Dinner();
dad.takeASlice();
mom.takeAslice(3);

System.out.println(Dinner.pizzaSlice);
   System.out.println(mom.pizzaSlice);
	}

}
