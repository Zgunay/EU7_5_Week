package day34PassingObjektTheMethod;

public class DiceTset {

	public static void main(String[] args) {

		final int SIX_SIDES=6;
		final int TWENTY_SIDES=20;
		Dice d= new Dice(SIX_SIDES); 
		rollDice(d);
		
	}
	
	public static void rollDice(Dice d) {
		
		System.out.println("Rolling a " + d.getSides() + " sided dice");
		d.roll();
		System.out.println("The dice value : " + d.getValue());
	}

}
