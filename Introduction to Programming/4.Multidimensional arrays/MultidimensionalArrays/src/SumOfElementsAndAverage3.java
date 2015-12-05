
public class SumOfElementsAndAverage3 {

	public static void main(String[] args) {
		int[][] array = {
				{4,5,9,5,6},
				{45,78,43},
				{1,2,3,4,5},
				{-5,-6,4,12},
				{10,12,5,6,7,8}
		};
		int sumOfElements = 0;
		int numberOfElements = 0;
		int average = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumOfElements = sumOfElements + array[i][j];
				numberOfElements++;
			}
		}
		average = sumOfElements/numberOfElements;
		System.out.println("Sum of elements is:" + sumOfElements);
		System.out.println("Average of elements is:" + average);
	}

}
