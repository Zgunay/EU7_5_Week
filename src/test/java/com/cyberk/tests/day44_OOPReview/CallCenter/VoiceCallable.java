package day44_OOPReview.CallCenter;

public interface VoiceCallable {
	  boolean CAN_CALL=true ; // public static final  otomatik atanir. interface sadece bunu kabul eder.
	  
	  
	void call(String contact);  // public abstract void call(String contact); default olarak gelir. 
	
	// static method 
	public static void decline() {
		System.out.println("My decline voice call...");
	}

	// default method
     public default void accept() {
		
		System.out.println("Mike finally accepted voice call..");
	}

}
