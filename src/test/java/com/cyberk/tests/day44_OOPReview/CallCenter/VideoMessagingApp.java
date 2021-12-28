package day44_OOPReview.CallCenter;

public abstract class VideoMessagingApp extends MessagingApp implements ScreenScharable,VideoCallable {
	// eger parents da no argument consructor varsa hata vermez.  cunku default olarak gizli bir consructor olusturur.
	// eger no parameter contructor yoksa ve parametreli bir connstructor varsa onu buraya tasiman gerekir. 
	// concrete degil overrite yapmana gerek yok . cunku bu da absract method.

}
