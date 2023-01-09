package Arrays;

public class FindDuplicateNumber {
	public static int duplicateNum(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 2};
		int res = duplicateNum(arr);
		
		System.out.println("The duplicate number is: " + res);
	}

}

/*
//optimal approach
 * int[] frequency = new int[n + 1];
 * for(int i = o;i < arr.length;i++){
 * if(freq[arr[i]] == 0){
 * frq[arr[i]] += 1;
 * }else{
 * return arr[i];
 * }
  
*/