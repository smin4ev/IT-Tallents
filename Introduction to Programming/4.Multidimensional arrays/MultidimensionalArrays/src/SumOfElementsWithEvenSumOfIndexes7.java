import org.omg.CORBA.COMM_FAILURE;

public class SumOfElementsWithEvenSumOfIndexes7 {

	public static void main(String[] args) {
		int[][] array = {
				{11,12,13,14,15,16,4},
				{21,22,23,24,25,26,3},
				{31,32,33,34,35,36,12},
				{41,42,43,44,45,46,21},
				{51,52,53,54,55,56,5},
				{61,62,63,64,65,66,7}
				
		};

		int sumOfCurrentRow = 0;
		int commonSum = 0;
		
		//Обхождане с два вложени цикъла
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if((i+j)%2 == 0){
//					sumOfCurrentRow = sumOfCurrentRow+array[i][j];
//					System.out.print(array[i][j] + " " );
//				}
//			}
//			System.out.println("Sum of elements with even sum of indexes for the row is " + sumOfCurrentRow );
//			commonSum = commonSum + sumOfCurrentRow;
//			sumOfCurrentRow = 0;
//		}
//		System.out.println("Common sum of elements is " + commonSum );
		
		//Обходжане с един цикъл(показано в клас)
		
		for (int i = 0; i < array[0].length*array.length; i++) {
			int row = i / array[0].length;
			int col = i % array[0].length;
			if((row + col)%2 == 0){
				sumOfCurrentRow = sumOfCurrentRow + array[row][col];
				System.out.print(array[row][col] + ", " );
			}
			if(col == array[0].length-1){
				System.out.println("Sum of elements with even sum of indexes for this row is " + sumOfCurrentRow);
				commonSum = commonSum+sumOfCurrentRow;
				sumOfCurrentRow = 0;
			}
			
		}
		System.out.println("Common sum of elements is " + commonSum );
	}
}


