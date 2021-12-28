package day20;

public class task80 {

	public static void main(String[] args) {

		
		checkedString("bu benim 11. yas günüm","11");
		

	}
	
	public static void checkedString(String str1,String str2) {
		
	int i;	
	i=str1.indexOf(str2);
	
	if((i=str1.indexOf(str2))>-1) { System.out.println("this is exist, index number is :" + str1.indexOf(str2));
		
	}else System.out.println("not exist");
	
		
	}
		
	}


