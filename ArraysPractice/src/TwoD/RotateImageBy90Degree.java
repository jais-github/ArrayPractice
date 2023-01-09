package TwoD;
//Rotate Image by 90 degree
public class RotateImageBy90Degree {
	public static void rotateArray(int[][] matrix) {
		 for(int i = 0; i < matrix.length;i++){
             for(int j = i;j< matrix[0].length;j++){
                int temp = 0;
                 temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
        }
        for(int i =0; i< matrix.length;i++){
            for(int j = 0;j < matrix.length/2;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    
	}
	public static void main(String[] args) {
		int[][] arr= {
				        {1, 2, 3},
				        {4, 5, 6},
				        {7, 8, 9}
		              };
		rotateArray(arr);
		System.out.println("Rotated Array");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr.length;j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
