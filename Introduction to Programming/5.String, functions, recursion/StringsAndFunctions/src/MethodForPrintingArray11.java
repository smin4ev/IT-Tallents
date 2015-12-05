import java.util.Scanner;

public class MethodForPrintingArray11 {

	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3,4,5,12,3,32,22,12};
		printArray(array);
	}

}
