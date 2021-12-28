package day10loop;

import java.text.DecimalFormat;

public class ex {
    public static void main(String[] args) {
    	System.out.println(sequenceSum(2.7) ); 

    	
}
    public static String sequenceSum(double a) {
        
        double sum=0;
        double b=0;
        if(a>0) {
        while(sum<a){
            b++;      
            sum=sum+(1/b);
                   
        }
       
}else {
	System.out.println("");
}       
    
        DecimalFormat myFormatter = new DecimalFormat("#.###");
        String output = myFormatter.format(sum);
       
      return output;  
        
    }
}
    
