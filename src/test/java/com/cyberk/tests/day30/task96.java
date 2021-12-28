package day30;

import java.util.Arrays;

public class task96 {

	public static void main(String[] args) {

String str1="Today is sunny and 89 degree.";
String[] arr=str1.split("and");
System.out.println(Arrays.toString(arr));
arr=arr[1].split("degree");

System.out.println(arr[0]);
		
	}

}
