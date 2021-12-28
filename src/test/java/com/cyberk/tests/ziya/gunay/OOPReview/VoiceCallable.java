package ziya.gunay.OOPReview;

public interface VoiceCallable {
	boolean CAN_CALL=false; 
	void call(String contact);
	public static void decline() {
		
	}
	public default void accept() {
		
	}
}
