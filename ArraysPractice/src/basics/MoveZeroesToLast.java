package basics;

public class MoveZeroesToLast {
	public static void moveZeroes(int[] arr) {
	int j=0;
	int n=arr.length;
	for(int i=0;i<n;i++) {
		if(arr[i] != 0 && arr[j] ==0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		if(arr[j] !=0) {
			j++;
		}
	}
	
	}
	
	public static void printArray(int[] arr) {
		int n =arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[] arr= {1,8,1,0,3,4,2,0,5};
		printArray(arr);
		moveZeroes(arr);
		printArray(arr);
		
	}

}
