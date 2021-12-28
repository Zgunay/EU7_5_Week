package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {

		AppleDevice mac = new Mac();
		mac.use();//  das ist ok  weil das overriding ist.
		// mac.code();  //  not overriding
		
		Mac mymac = new Mac();
		mymac.use();  //  Mac icerisinde olusturuldugu icin problem yok
		mymac.code(); // Mac icerisinde olusturuldugu icin problem yok
		
		AppleDevice watch = new AppleWatch();
		watch.use();
	}

}
