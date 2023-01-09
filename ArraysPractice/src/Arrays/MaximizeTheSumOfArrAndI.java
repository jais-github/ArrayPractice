package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheSumOfArrAndI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
        
        
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
        	arr[i] = scan.nextInt();
        }
        
        int ans = maximise(arr);
        System.out.println(ans);
	}

	public static int maximise(int[] arr) {
		int osum =0;
		Arrays.sort(arr);
		
		for(int i= 0;i < arr.length;i++) {
			osum += arr[i];
		}
		return osum;
	}

}
