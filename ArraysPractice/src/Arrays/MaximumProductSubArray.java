package Arrays;

public class MaximumProductSubArray {
	
	class Solution {
	    public int maxProduct(int[] nums) {
	      int n = nums.length;
	        int result = nums[0];
	        
	       
	        for(int i=0; i < n; i++){
	            int product = 1;
	            for(int j = i; j < n; j++){
	               product = product * nums[j];
	                result = Math.max(result, product);
	            }
	        }
	        return result;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

