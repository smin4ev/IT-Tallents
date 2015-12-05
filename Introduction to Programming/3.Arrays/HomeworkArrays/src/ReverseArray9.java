import java.util.Scanner;

public class ReverseArray9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize = sc.nextInt();
		while(arrSize<1){
			System.out.println("Size of array must be > 1! Enter valid size:");
			arrSize = sc.nextInt();
		}
		int[] array = new int[arrSize];
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//Reverse with additional array
		int[] newArr = new int[array.length];
		System.out.println("Reversed with additional array:");
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = array[array.length-1-i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed without additional array:");
		for (int i = 0; i < array.length/2; i++) {
			int temp = array[array.length-1-i];
			array[array.length-1-i] = array[i];
			array[i] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
