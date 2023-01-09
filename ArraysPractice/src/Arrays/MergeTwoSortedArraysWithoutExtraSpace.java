package Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
	public static void merge(int[] arr1, int arr2[] , int n,int m) {
		int i,k;
		
		for(i = 0; i < n; i++) {
		if(arr1[i] > arr2[0]) {
			int temp = arr1[i];
			arr1[i] = arr2[0];
			arr2[0] = temp;
		}
		int first = arr2[0];
		//insertion sort
		for(k = 1; k < m && arr2[k] < first;k++) {
			arr2[k - 1] = arr2[k];
		}
		arr2[k - 1] = first;
	}
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 7, 8, 10};
		int[] arr2 = {2, 3, 9};
		
		System.out.println("Before Merge");
		
		for(int i= 0;i < arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("After merge");
		merge(arr1, arr2, arr1.length, arr2.length);
	    
		for(int i= 0;i < arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
