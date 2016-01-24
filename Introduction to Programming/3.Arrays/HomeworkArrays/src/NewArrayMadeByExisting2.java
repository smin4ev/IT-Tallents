import java.util.Scanner;

public class NewArrayMadeByExisting2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();
		while(arraySize<1){
			System.out.println("Array size must be positive number:");
			arraySize = sc.nextInt();
		}
		int[] array = new int[arraySize];
		System.out.println("Please enter array members:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] newArray = new int[array.length*2];
		
		for (int i = 0; i < newArray.length/2; i++) {
				newArray[i] = array[i];
		}
		for (int i = newArray.length/2; i < newArray.length; i++) {
			newArray[i] = array[arraySize-1];
			arraySize--;
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		
	

	}

}
