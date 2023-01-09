package Arrays;

import java.util.Scanner;

public class SumOfArray {
	public static int SumArray(int[] arr, int n) {
		int sum=0;
		for(int i : arr) {
		
			
				sum += i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = SumArray(arr,n);
		System.out.println("The sum of the given array: "+ sum);
	}

}
