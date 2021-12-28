package day20;

public class asses {

	public static void main(String[] args) {

//String s="purr";
//System.out.println(s=s.toUpperCase());
//
//System.out.println(s.trim());
//
//System.out.println(s=s.substring(1, 3));
//
//System.out.println(s+=" two");
//
//System.out.println(s.length());
		
//		String space=" ";
//		String composite = space + "hello" +space+space;
//		composite=composite.concat("world");
//		String str="MINIMUM";
//		System.out.println(str.substring(4,7));
//		int x= str.indexOf("t", 5);
//		System.out.println(x);
//		String trimmed = composite.trim();
//		System.out.println(trimmed.length());
		
		String str="JavaScript";
		System.out.println(getMsg(str));
		
	}
	public static String getMsg(String x) {
		String msg= "Input value must be";
		msg= msg.concat("smaller than "+ x);
		msg.replace("X", "x");
		String rest= "and larger than 0";
		msg.concat(rest);
		return msg;
	}

}
