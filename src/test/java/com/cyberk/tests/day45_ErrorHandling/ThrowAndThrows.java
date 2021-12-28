package day45_ErrorHandling;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException   {

		System.out.println("Hello world");
		
		//throw new RuntimeException("This is some exception");
		
//		try {
//			throw new Exception("Another exception"); // checked exception
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		String username="";
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
			
		}else {
			System.out.println("Valid username");
		}
		sleep3(2);
		}

	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) throws InterruptedException {
		
		sleep2(seconds);
	}
}
