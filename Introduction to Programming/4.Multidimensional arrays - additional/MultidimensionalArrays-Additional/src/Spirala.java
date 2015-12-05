import java.util.Scanner;

public class Spirala {

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
		int iter = 0;
		
			//for (int z = 0; z <((((row<col)?row:col))/2 + ((row<col)?row:col)%2) ; z++) {
			
			while(true){
				//Първи незапълнен ред
				for (int i = iter; i < col-iter; i++) {
					array[iter][i] = valueInArray;
					valueInArray++;	
				}
				if(valueInArray==row*col+1){
					break;
				}
				
				//Последна незапълнена колона
				for (int i = iter; i < row-1-iter; i++) {
					array[i+1][col-1-iter] = valueInArray;
					valueInArray++;	
				}
				if(valueInArray==row*col+1){
					break;
				}
				
				//Последен незапълнен ред
				for (int i = col-2-iter; i >=0+iter ; i--) {
					array[row-1-iter][i] = valueInArray;
					valueInArray++;		
				}
				if(valueInArray==row*col+1){
					break;
				}
				
				//Първа незапълнена колона
				for (int i = row-2-iter; i > iter; i--) {
					array[i][iter] = valueInArray;
					valueInArray++;		
				}
				if(valueInArray==row*col+1){
					break;
				}

				iter++;  
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "        ");
				}
				System.out.println();
			}
	}
}
