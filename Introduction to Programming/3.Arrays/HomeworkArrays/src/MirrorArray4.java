import java.util.Scanner;

public class MirrorArray4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();
		boolean flag = true;
		while(arraySize<1){
			System.out.println("Array size must be positive number:");
			arraySize = sc.nextInt();
		}
		int[] array = new int[arraySize];
		System.out.println("Please enter array members:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] != array[array.length-1-i]){
				flag = false;
				break;
			}
		}
		if(flag==true){
			System.out.println("Array is mirror!");
		}
		else{
			System.out.println("Array is not mirror!");
		}
	}
}
