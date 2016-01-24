import java.util.Scanner;

public class Snake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers for matrix size:");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		while(rows<1 || cols<1){
			System.out.println("Please enter positive numbers:");
			rows = sc.nextInt();
			cols = sc.nextInt();
		}
		int [][] array = new int[rows][cols];
		int valueInArray = 1;
		
		//За първата половина
		for(int i = 0; i<rows; i++){
			if(i%2 == 1){
				int row = i; int col = 0;
				while(row>=0 && col<cols){
					array[row][col] = valueInArray;
					valueInArray++;
					row--;
					col++;
				}
			}
			
			if(i%2 == 0 && i >= cols){
				int row = i-cols+1; int col = cols-1;
				while(row<rows && col>=0){
					array[row][col] = valueInArray;
					valueInArray++;
					row++;
					col--;
				}
			}
			
			else
				if(i%2 == 0){
				int row = 0; int col = i;
				while(row<rows && col>=0){
					array[row][col] = valueInArray;
					valueInArray++;
					row++;
					col--;
				}
			}
		}
		
		//За втората част
		if(rows<cols & rows%2 == 0){
			for(int i = 1; i<=cols-rows; i++){
				if(i%2 == 1){
					int row = 0; int col = rows+i-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++;
						col--;
					}
				}
				
				if(i%2 == 0){
					int row = rows-1; int col = i;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
			}
			//за последната част
			for(int i = 0; i<rows-1; i++){
				if(i%2 == 0){
					int row = rows-1; int col = cols-rows + 1 + i;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
				
				if(i%2 == 1){
					int row = 1+i; int col = cols-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++; 
						col--;
					}
				}
			}
			//край на за последната част
		}
		
		if(rows<cols & rows%2 == 1){
			for(int i = 1; i<=cols-rows; i++){
				if(i%2 == 1){
					int row = rows-1; int col = i;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
				if(i%2 == 0){
					int row = 0; int col = rows+i-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++;
						col--;
					}
				}
			}
		
			
			//За последната част
			for(int i = 0; i<rows-1; i++){
				if(i%2 == 0){
					int row = rows-1; int col = cols-rows + 1 + i;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
				
				if(i%2 == 1){
					int row = 1+i; int col = cols-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++; 
						col--;
					}
				}
			}
		 //край на за последната част
		}
		
		if(rows>=cols && rows%2 == 1 ){
			for(int i = 0; i<cols-1; i++){
				if(i%2 == 0){
					int row = rows-1; int col = i+1;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
				if(i%2 == 1){
					int row = rows-cols+1+i	;	 int col = cols-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++;
						col--;
					}
				}
			} 
		}
		
		if(rows>=cols && rows%2 == 0){
			for(int i = 0; i<cols-1; i++){
				if(i%2 == 0){
					int row =rows-cols + i+1; int col = cols-1;
					while(row<rows && col>=0){
						array[row][col] = valueInArray;
						valueInArray++;
						row++;
						col--;
					}
				}
				if(i%2 == 1){
					int row = rows-1; int col = i+1;
					while(row>=0 && col<cols){
						array[row][col] = valueInArray;
						valueInArray++;
						row--;
						col++;
					}
				}
			}
		}
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}