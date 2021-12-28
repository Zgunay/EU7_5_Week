package day40_accesmodofiers_final_hiding;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME ;

	public FinalVariables() {
		MODEL_3_MAXSPEED=200;	
//		ADMIN_USERNAME= "Mike"; //	WHY ERROR
		
	}
		
	{
		MODEL_X_PASSENGERS=7;	
//		ADMIN_USERNAME= "Mike";
		
	}
	
	
	static {
		ADMIN_USERNAME= "Mike";
		
	}

	public static void main(String[] args) {
		
		final int MAX_Passengers_Count=5;
		
		final int SSN;
		SSN=66;
//		SSN++;
		FinalVariables finalVars= new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(ADMIN_USERNAME);

	}

}
