import java.util.Scanner;

public class MakeArrayByOneStartNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number for the array:");
		int startNum = sc.nextInt();
		int[] array = new int[10];
		array[0] = startNum;
		array[1] = startNum;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
