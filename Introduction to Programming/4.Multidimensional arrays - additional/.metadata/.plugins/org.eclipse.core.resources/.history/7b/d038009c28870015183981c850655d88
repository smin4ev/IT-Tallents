import java.util.Scanner;

public class Task11ThirdCaseBetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int array[][] = new int[rows][cols];
		int num = 1;
		
		for (int i = 0; i < rows; i++) {
			int r = i, c = 0;

			//fills one diagonal
			while (r >= 0 && c < cols) {
				array[r][c] = num;
				num++;
				r--;
				c++;
			}
		}
		
		for (int i = 1; i < cols; i++) {
			int r = rows-1, c = i;

			//fills one diagonal
			while (r >= 0 && c < cols) {
				array[r][c] = num;
				num++;
				r--;
				c++;
			}
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

}
