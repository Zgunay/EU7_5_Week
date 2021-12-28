package day13Method;



public class PassArg {

	public static void main(String[] args) {

		output(6,3,"a");
	}
	public static void output(int num,int num2,String num3  ) {
		switch (num3) {
			case "-":
						
		System.out.println("calculator" + ("(" + num + "," + num2 + "," + "\"" + num3 + "\""+ ")")+" -->" + (num-num2));
		
break;     
			case "+" :
		System.out.println("calculator" + ("(" + num + "," + num2 + "," + "\"" + num3 + "\""+ ")")+" -->" + (num+num2));
			
		break;
		
		default:
			System.out.println("nothing");
		}
	}  
	

}
