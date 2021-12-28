package day44_OOPReview.CallCenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp wa= new WhatsApp();
		wa.launch();
		wa.allOSCCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();

        VoiceCallable.decline();  // static void decline()  static oldugu icin ....wa ile olmaz
        System.out.println(VoiceCallable.CAN_CALL);
        
        VoiceCallable obj = new WhatsApp();
 //       obj.launch();  bu calismaz Reference type karar verir. Refernce VoiceCallable da launch yok. Casting 
//        yapmamiz gerekli.
        ((MessagingApp)obj).launch();  // bu sekilde yapilir. 
        
        MessagingApp obj1 = (MessagingApp) obj;
        obj1.launch();  // böylede olur... 
        
 //       obj.allOSCCompatible= false;  olmaz 
        
        ((MessagingApp)obj).allOSCCompatible=false;   //  birinci sekil bu sekilde
        
        obj1.allOSCCompatible=true; // ikinci bu sekilde
        
        ((WhatsApp)obj).videoCall();

        
        obj= new WhatsApp2();
        obj.accept();
        
	}

}
