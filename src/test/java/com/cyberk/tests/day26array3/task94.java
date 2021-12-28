package day26array3;

public class task94 {

	public static void main(String[] args) {

  String str1="This info used for creation password: xxxCD132Gxxx. Please do not share with anyone";
  String str2="This info used for creation password: xxx00ABC!xxx. Please do not share with anyone";
  String [] first= str1.split(" ");
  String a=first[6].replace("x", "").replace(".", "");
  System.out.println(a);
  String [] second= str2.split(" ");
  String b=second[6].replace("x", "").replace(".", "");
  System.out.println(b);
  System.out.println("New Password is = " + a.concat(b));
		
		
	}

}
