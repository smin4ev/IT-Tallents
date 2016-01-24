import java.util.Scanner;

public class BuildMatrixDiffernetOrderThird11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers for matrix size:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		while(row<1 || col<1){
			System.out.println("Please enter positive numbers:");
			row = sc.nextInt();
			col = sc.nextInt();
		}
		int [][] array = new int[row][col];
		int valueInArray = 1;
		int sumOfIndexes = 0;
		int currSumOfIndexes = 0;
		
//			for (int i = 0; i < array.length; i++) {
//				for (int j = 0; j < array.length; j++) {
//				
//						if(i<j){
//							array[j][i] = valueInArray;
//							valueInArray++;
//						}
//						if(i>=j){
//							array[i][j] = valueInArray;
//							valueInArray++;
//						}
//				}
//				sumOfIndexes++;
//			}
		
		//За първата половина
		 if(row<=col){
		 for (int i = 0; i < array.length ; i++){
	            for (int j = 0; j <= i; j++){
	                array[i-j][j] = valueInArray;
	                valueInArray++;
	            }
	        }
		 }
		 
		 //За първата половина
		 if(row>col){
			 for (int i = 0; i < array[0].length ; i++){
		            for (int j = 0; j <= i; j++){
		                array[i-j][j] = valueInArray;
		                valueInArray++;
		            }
		        }
			 if(row-col>=2){
				 for (int i = array[0].length; i < row; i++) {
					for (int j = 0; j < array[0].length; j++) {
						array[i-j][j] = valueInArray;
		                valueInArray++;
					}
				}
			 }
		 }
		 
		 //За втората половина
		 if(row==col){
			 for (int i = array.length-1; i > 0; i--) {
				for (int j = 0 ; j < i; j++) {
					array[array.length-1-j][array.length-i+j] = valueInArray;
					valueInArray++;
				}
			}
		 }	
		 
		 //За втората половина
		 if(row<col){
			 int diffColRow = col-row;
			 int temp = array.length-1;
			 int helper = 0;
			 for (int i = 0; i < diffColRow; i++) {
				 for (int j = 0; j < array.length; j++) {
					array[array.length-1-j][1+j+helper] = valueInArray;
					valueInArray++;
				}
				 helper++;
			 }
			 helper = 0;
			 for (int i = array.length-1; i > 0; i--) {
				for (int j = 0; j < i ; j++) {
					array[array.length-1-j][diffColRow+1+j+helper] = valueInArray;
					valueInArray++;
				}
			 helper++;
			}
		 }
		 
		 //За втората половина
		 if(row-col==1){
			 for (int i = array.length-1; i > 0; i--) {
					for (int j = 0 ; j < i; j++) {
						array[array.length-1-j][array.length-1-i+j] = valueInArray;
						valueInArray++;
					}
				}
		 }
		 
		 //За втората половина
		 if(row - col>=2){
			 int temp = 0;
			 for (int i = array.length-1; i >row-col ; i--) {
				for (int j = 1; j < col-temp ; j++) {
					array[array.length-j][array.length-1-i+j] = valueInArray;
					valueInArray++;
				}
		 		temp++;
			}
		 }
		 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
