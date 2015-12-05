import java.util.Scanner;

public class DiagonalesOfMultiArray2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];
		System.out.println("Enter array elements.");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements on main diagonal are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(i==j){
					System.out.print(array[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Elements on secondary diagonal are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(i+j == array.length-1){
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}
