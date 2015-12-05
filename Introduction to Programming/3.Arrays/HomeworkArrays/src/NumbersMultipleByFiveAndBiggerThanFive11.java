import java.util.Scanner;

public class NumbersMultipleByFiveAndBiggerThanFive11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int counter = 0;
		int[] array = new int[7];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]>5 && (array[i]%5 == 0)){
				System.out.print(array[i] + " ");
				counter++;
			}
		}
		System.out.println(counter + " numbers are according requirements!");
	}

}
