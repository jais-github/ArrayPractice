package Arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static int  secondLargest(int[] array,int m) {
		
		
		for(int i = 0;i < m;i++) {
			for(int j = i+1; j < m;j++) {
			if(array[i] > array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
			
		}
		return array[array.length -2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {1, 3, 5, 7, 9, 2, 4, 6};
		int n =array.length;
		
		int secLar = secondLargest(array,n);
		
		System.out.println("Second largest element of an array is: "+ secLar);
		
	}

}
