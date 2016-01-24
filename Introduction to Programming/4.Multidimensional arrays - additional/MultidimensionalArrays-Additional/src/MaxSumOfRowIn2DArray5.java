
public class MaxSumOfRowIn2DArray5 {

	public static void main(String[] args) {
		int[][] array = {
				{12,34,16,65,23,54},
				{44,91,19,16,51,59},
				{67,22,92,51,43,18},
				{78,21,69,46,93,41},
				{10,28,57,72,21,88},
		};
		int currentRowSum = 0;
		int maxRowSum = Integer.MIN_VALUE;
		int maxRow = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				currentRowSum = currentRowSum + array[i][j];
			}
			if(currentRowSum>maxRowSum){
				maxRowSum = currentRowSum;
				maxRow = i+1;
			}
			currentRowSum = 0;
		}
		System.out.println("Max sum of row is " + maxRowSum + " on row " + maxRow);
	}

}
