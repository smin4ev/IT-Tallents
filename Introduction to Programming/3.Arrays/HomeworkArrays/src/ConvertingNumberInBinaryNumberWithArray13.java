import java.util.Scanner;

public class ConvertingNumberInBinaryNumberWithArray13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for converting >= 1");
		int number = sc.nextInt();
		while(number<1){
			System.out.println("Please enter number >=1");
			number = sc.nextInt();
		}
		int numForManipulation = number;
		int counter = 0;
		
		while(numForManipulation>0){
			numForManipulation = numForManipulation/2;
			counter++;
		}
		int[] array = new int[counter];
		for (int i = array.length-1; i >= 0 ; i--) {
			array[i] = number%2;
			number = number/2;
		}
		System.out.println("Entered number in binary is:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
