package Arrays;

public class SearchInRotatedSortedArray {
	
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            
            //the left side is sorted
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                    
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] nums = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
		int n = nums.length;
		int target = 3;
		System.out.println("Index of the element is : "+search(nums,target));

	}

}
