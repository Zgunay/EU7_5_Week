package day27arraypart4;

public class task95 {

	public static void main(String[] args) {

int[] [] students = {{68,75,54,80},{100,64,20,50},{10,35,40,90}} ;
int sum=0,sum1=0;
int avg;

for( int col=0; col< students[0].length;col++) {
	
	sum=sum+ students[0][col];
	
} for(int k=0; k<students.length;k++) {
	
	
	sum1=sum1+students[k][0];
}

	avg=sum/students[0].length;
	System.out.println(avg);
	System.out.println(sum1);
	
	}

}
