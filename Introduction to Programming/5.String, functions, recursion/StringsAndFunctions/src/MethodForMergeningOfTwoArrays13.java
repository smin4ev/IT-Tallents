import java.util.Scanner;

public class MethodForMergeningOfTwoArrays13 {

	public static int[] mergeningOfTwoArrays(int[] firstArr, int[] secondArr){
		int[] finalArr = new int[firstArr.length+secondArr.length];
		for (int i = 0; i < firstArr.length; i++) {
			finalArr[i] = firstArr[i];
		}
		for (int i = 0; i < secondArr.length; i++) {
			finalArr[firstArr.length+i] = secondArr[i];
		}
		return finalArr;
				
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] firstArray = new int[5];
		System.out.println("Enter elements of first array - 5 elements:");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = sc.nextInt();
		}
		int[] secondArray = new int[10];
		System.out.println("Enter elements of second array - 10 elements:");
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = sc.nextInt();
		}
		int[] finalArr = mergeningOfTwoArrays(firstArray,secondArray);
		System.out.println("New array after mergening of two existing is:");
		//MethodForPrintingArray11.printArray(finalArr); - може да принтираме и с метода от 11 задача
		
		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i] + " ");
		}
		
	}

}
