package basics;

public class SmallestElememt {
public static int findSmallest(int[] arr) {
	if(arr == null || arr.length == 0) {
		throw new IllegalArgumentException("Invalid input");
	}
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i] < min) {
			min=arr[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,9,3,15,1,2};
		int findMin=findSmallest(arr);
		System.out.println("Smallest elememt in the given array is:"+findMin);
	}

}
