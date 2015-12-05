
public class SumOfElementsOnEvenRows6 {

	public static void main(String[] args) {
		int[][] array = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int currentRowSum = 0;
		int commonSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(i%2 == 1){//ако индекса на реда е нечетен, редът е с четна поредност
					currentRowSum = currentRowSum + array[i][j];
					System.out.print(array[i][j] + ",");
				}
				
			}
			if(i%2==1){
			System.out.println(" Sum of this row is " + currentRowSum);
			}
			commonSum = commonSum + currentRowSum;
			currentRowSum=0;
		}
		System.out.println("Common sum of all even rows is " + commonSum);
	}

}
