import java.util.Scanner;

public class MethodsForNumbersFrom1toN12 {

	public static int[] numbersFrom1ToN(int number){
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for array size >= 1:");
		int arrSize = sc.nextInt();
		while(arrSize<1){
			System.out.println("Array size must be >=1");
			arrSize = sc.nextInt();
		}
		int[]array = numbersFrom1ToN(arrSize);//създаваме масив с метода описан по-горе
		//отпечатваме масива с извикване на метод от друг клас
		MethodForPrintingArray11.printArray(array);
	}

}

