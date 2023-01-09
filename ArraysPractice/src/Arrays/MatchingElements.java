package Arrays;

public class MatchingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 3, 2, 5, 1};
		int n = array.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i] == array[j]) {
					System.out.print(array[i]);
				}
			}
		}
	}

}
