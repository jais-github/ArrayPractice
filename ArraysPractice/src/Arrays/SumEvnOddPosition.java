package Arrays;

import java.util.ArrayList;
import java.util.Collections;

//Two arrays are given and we supposed to find the sum of ones SecondLargest element and 
// ones secondSmallest element
public class SumEvnOddPosition {
	public static int LargestSmallSum(int[] arr) throws java.lang.Exception{
		if(arr.length < 0) {
			return 0;
		}
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i += 2) {
			l1.add(arr[i]);
		}
		
		for(int i =1;i<arr.length;i += 2) {
			l2.add(arr[i]);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		int n = l1.size();
		return l1.get(n-2)+l2.get(1);
		
	}
	/*public static void main(String[] args) {
		int n = 0;
		int[] arr = new int[n];
		
		try {
			int largeSmall= LargestSmallSum(arr);
			System.out.println(largeSmall);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		*/
	}
	


