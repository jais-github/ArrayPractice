package Arrays;

import java.util.Arrays;

public class ContainsDuplicate {
   public static boolean ContainsDuplicate(int[] nums) {
	   Arrays.sort(nums);
	   
	   for(int i = 0; i < nums.length -1 ;i++) {
		   if(nums[i] == nums[i +1 ]) return true;
	   }
	   return false;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {10, 5, 3, 4, 5, 3, 6};
     if(ContainsDuplicate (arr))
    	 System.out.println("Yes");
     else
    	 System.out.println("No");
	}

}
/*
HashSet<Integer> numbers = new HashSet<>();

for(int i = 0;i < nums.length;i++){
if(numbers.contains(nums[i])) return true;
}
return false;

*/