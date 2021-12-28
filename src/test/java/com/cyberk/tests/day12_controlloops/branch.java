package day12_controlloops;

public class branch {

	public static void main(String[] args) {

int number=0;
while (number<15) {
	number++;
	if(number<=5) {
		System.out.println("Skipped number" + number);
		continue;
	}
	System.out.println("number=" + number);
	if (number>=10) {
		System.out.println("Breaking at" +number);
		break;
	}
}
		
		
	}

}
