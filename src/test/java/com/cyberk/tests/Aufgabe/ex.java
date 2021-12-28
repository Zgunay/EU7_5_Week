package Aufgabe;

public class ex {

	public static void main(String[] args) {

//label1: for(int i=0; i<10;i++) {
//	
//	for(int j=0; j<10;j++) {
//		if(i+j-1>10) {
//			break label1;
//		}
//	}
//	System.out.println("hi");
//}
		
int counter=4;

outer:
	for(int i=0;i<4;i++) {
		
		middle: for(int j=0;j<4;j++) {
			inner: 
				for(int k=0;k<4;k++) {
					if(k-j>0) {
						break middle;
					}
					counter++;
				}
		}
	}
System.out.println("\\\\");
System.out.println("'");
System.out.println("\ta\tb\tc");
System.out.println("\"\"\"");
System.out.println("C:\nin\the downward spiral");
System.out.println("have any   \" errors\"  in it");
	
	}
	public static void method() {
		
	}
}
