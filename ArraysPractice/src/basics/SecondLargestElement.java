package basics;

public class SecondLargestElement {
	public static int findSecondMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				secondMax=max;
				max=arr[i];
			}else if(arr[i] >secondMax && arr[i] != max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int[] arr= {13,34,2,34,33,1};
		int secondMin=findSecondMax(arr);
		System.out.println("Second Smallest element is: "+findSecondMax(arr));

	}

}
