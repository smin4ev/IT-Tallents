import java.util.Scanner;

public class LongestSequenceOfEqualElements8 {

	public static void main(String[] args) {
		int counter = 1;
		int maxSequenceLen = 1;
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
		int maxRepeatElement = array[0];
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] == array[i+1]){
				counter++;
			}
			if(array[i] != array[i+1]){
				counter = 1;
			}
			if(counter>maxSequenceLen){
				maxSequenceLen = counter;
				maxRepeatElement = array[i];
			}
		}
		int[] newArr = new int[maxSequenceLen];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = maxRepeatElement; 
			System.out.print(newArr[i] + " ");
		}
	}

}
