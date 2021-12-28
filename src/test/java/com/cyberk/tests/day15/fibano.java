package day15;

public class fibano {

	public static void main(String[] args) {

		int num=8;
		
		int num1=0,num2=1;
		int i,sum;
		System.out.println(num2);
		for(i=1;i<=num;i++)     {
			
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
			
			
			
		}
		
		
	}

}
