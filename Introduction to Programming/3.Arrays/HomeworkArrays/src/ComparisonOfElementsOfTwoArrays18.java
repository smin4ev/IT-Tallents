import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class ComparisonOfElementsOfTwoArrays18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] firstArr = new int[10];
		int[] secondArr = new int[10];
		int[] finalArr = new int[10];
		
		System.out.println("Please enter elements of first array:");
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = sc.nextInt();
		}
		System.out.println("Please enter elements of second array");
		for (int i = 0; i < secondArr.length; i++) {
			secondArr[i] = sc.nextInt();
		}
		for (int i = 0; i < finalArr.length; i++) {
			if(firstArr[i] < secondArr[i]){
				finalArr[i] = secondArr[i];
			} 
			else {
				finalArr[i] = firstArr[i];
			}
		}
		System.out.println("Elements of third array are:");
		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i] + " ");
		}

	}

}
