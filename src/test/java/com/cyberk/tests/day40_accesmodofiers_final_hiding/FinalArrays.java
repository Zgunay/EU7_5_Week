package day40_accesmodofiers_final_hiding;

public class FinalArrays {

	public static void main(String[] args) {
final int[] teams = {11,11};
System.out.println(teams[0]);
teams[0]=15;
System.out.println(teams[0]);
int[] nums = new int [] {20,20,40};
nums = new int [] {10,15,100};
System.out.println(nums[0]);
final int[] finalNums= {23,66,44};
finalNums[0]=120;
//   finalNums = new int[] {10,15,100};   error
// finalNums = new int[] {1,2,3,4};  baska objekte refer edemezsin. Array listesi icinde gecerli.

	}

}
