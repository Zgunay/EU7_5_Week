package day44_OOPReview.CallCenter;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCCompatible;
	private static int count;
	public static final String APP_TYPE = "Messenger";
	
public MessagingApp() {
	System.out.println("MessagingApp no-args constructor...");
	}

public MessagingApp(String name,int count) {
	this.name=name;
	this.count=count;
	
}

  public abstract void sendMessage(String msg) ;
   
  public void launch () {
	  System.out.println("MessagingApp is launching");
}
  public static void close() {
	  System.out.println("Messaging is closing");
}

public static int getCount() {
	return count;
}

public static void setCount(int count) {
	MessagingApp.count = count;
}
  
  
}
