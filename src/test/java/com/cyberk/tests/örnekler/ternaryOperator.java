package örnekler;

public class ternaryOperator {

	public static void main(String[] args) {

String action;
boolean isGreen=false;
		
		action= (isGreen==true) ? "Can Dirve" :"Can not drive";
		System.out.println(action);
		
		
//		int bill=4000,discount;
//		discount= (bill>2000) ? 15:10;
//		System.out.println(discount);
		
		int qty=11,bill=1000;
		int discount=(bill>1000)? (qty>11)? 10:9:5;
		System.out.println(discount);
		
	}

}
