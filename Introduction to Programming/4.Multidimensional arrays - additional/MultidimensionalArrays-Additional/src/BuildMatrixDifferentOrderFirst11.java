import java.util.Scanner;

public class BuildMatrixDifferentOrderFirst11 {

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
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = valueInArray;
				valueInArray++;
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
