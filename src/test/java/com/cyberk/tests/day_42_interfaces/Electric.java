package day_42_interfaces;

public interface Electric {
	
	public static final boolean HAS_BATTERIES= true;
	boolean HAS_BATTERIES2= false; // public final static  default
	
	public abstract void charge();
	void charge2();// public abstract
	
	public default void methodA() {  // abstract static or default can be. 
		
		
	}
	
	public default void methodB() {
		
		
	}

}
