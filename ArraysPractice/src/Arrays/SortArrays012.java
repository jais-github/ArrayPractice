package Arrays;

public class SortArrays012 {
	public static void sortNum(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp = 0;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0 : {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1:{
				mid++;
				break;
		    }
		case 2:{
			temp = arr[high];
			arr[high] = arr[mid];
			arr[mid] = temp;
			high --;
			break;
		}
			}
		}
		
	}
	static void printArray(int[] arr) {
		for(int i = 0;i< arr.length;i++) {
			System.out.print( arr[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 0, 2, 1, 0, 2, 0};
		sortNum(arr);
		printArray(arr);
	}

}
