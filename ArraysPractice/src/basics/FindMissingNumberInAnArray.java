package basics;

public class FindMissingNumberInAnArray {
	public static int find(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		
		for(int num :arr) {
			sum=sum-num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {2,4,1,8,6,3,7};
		find(arr);
		System.out.println(find(arr));
	}

}
