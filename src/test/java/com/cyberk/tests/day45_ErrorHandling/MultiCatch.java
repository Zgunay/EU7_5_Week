package day45_ErrorHandling;

public class MultiCatch {

	public static void main(String[] args) {

		try {
		System.out.println(4/0);
		String str=null;
		System.out.println(str.toUpperCase());
		int[]n= {10,4};
		System.out.println(n[2]);
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic exception happened");
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("NullPointe exception happened");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
