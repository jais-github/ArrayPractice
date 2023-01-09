package Arrays;

public class TrappingRainWater {
	
	public static int trap(int[] height) {
        int n = height.length;
    
    int[] maxleft = new int[n];
    int[] maxright = new int[n];
     int water = 0;
    
    for(int i = 0;i < n; i++){
        if(i == 0){
        
     maxleft[0] = height[0];
           maxright[n - 1] = height[n - 1];
    }
      else {
      maxleft[i] = Math.max(height[i],maxleft[i - 1]);
          maxright[n - i -1] = Math.max(height[n - i - 1],maxright[n - i]);
      }
    }
    for(int i = 0;i < n; i++){
        water += Math.min(maxleft[i],maxright[i]) - height[i];
    }

return water;
}
	
	public static void main(String[] args) {
		int[] height = {0, 1, 0, 1, 3, 1, 5, 2, 4, 2, 4};
		
		
		
		System.out.println(trap(height));

	}

}
