
public class MaxSumOfSubMatrix9 {

	public static void main(String[] args) {
		int[][] arr = {
				{12,34,16,65,23,54},
				{44,91,19,16,51,59},
				{67,22,92,51,43,18},
				{78,21,69,46,93,41},
				{10,28,57,72,21,88},
		};
		int currentSum = 0;
		int first = 0;
		int second = 0;
		int third = 0;
		int fourt = 0;
		
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				currentSum = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
				if(currentSum>maxSum){
					maxSum = currentSum;
					first = arr[i][j];
					second = arr[i][j+1];
					third = arr[i+1][j];
					fourt = arr[i+1][j+1];
				}
			}
		}
		int[][] subArr ={
				{first, second},
				{third, fourt}
		};
		System.out.println("Sub array with max sum is:");
		for (int i = 0; i < subArr.length; i++) {
			for (int j = 0; j < subArr[0].length; j++) {
				System.out.print(subArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Max sum is " + maxSum);
	}

}
