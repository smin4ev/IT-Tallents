
public class BiggestRowOrBiggestColIsBigger5 {

	public static void main(String[] args) {
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int rowBiggestSum= Integer.MIN_VALUE;
		int colBiggestSum = Integer.MIN_VALUE;
		int currentRowSum = 0;
		int currentColSum = 0;//може и само с една променлива за временната сума, но така е по-ясно
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				currentRowSum = currentRowSum+array[i][j];
			}
			if(currentRowSum>rowBiggestSum){
				rowBiggestSum = currentRowSum;
			}
			currentRowSum = 0;
			
		}
		System.out.println("Biggest row sum is " + rowBiggestSum);
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				currentColSum = currentColSum + array[i][j];
			}
			if(currentColSum>colBiggestSum){
				colBiggestSum = currentColSum;
			}
			currentColSum = 0;
		}
		System.out.println("Biggest col sum is " + colBiggestSum);
		
		if(rowBiggestSum>colBiggestSum){
			System.out.println("Biggest row sum is bigger than biggest col sum!");
		}
		if(colBiggestSum>rowBiggestSum){
			System.out.println("Biggest col sum is bigger than biggest row sum!");
		}
		if(rowBiggestSum == colBiggestSum){
			System.out.println("The two biigest sum on row and col are equal!");
		}
	}

}
