import java.util.Scanner;

public class NewArrayMadeByMembersOfExisting7 {

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
		
		int[] newArr = new int[array.length];
		newArr[0] = array[1] + array[array.length-1];
		newArr[newArr.length-1] = array[array.length-2] + array[0];
		for (int i = 1; i < newArr.length-1; i++) {
			newArr[i] = array[i-1] + array[i+1];
		}
		System.out.println("Each element of new arrays is sum of previous and next "
				+ "corresponding elements of existing array. First element of new array is "
				+ "made by sum last element and second elements of existing array. Similarly and "
				+ "for the last element in new array. Elements are :");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}
