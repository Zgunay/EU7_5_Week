package day20;

public class task81 {

	public static void main(String[] args) {

		String date= "10/10/2019 14:59:00";
		date.equalsIgnoreCase(date)
		System.out.println(timeStamp(date));
	}
	
	public static String timeStamp(String date) {
		
		date=(date.replace("/", "").replace(" ", "").replace(":", ""));
		
		return date;
	}

}
