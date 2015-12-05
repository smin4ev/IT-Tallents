import java.util.Scanner;

public class EqualArrays6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array:");
		int firstArrSize = sc.nextInt();
		System.out.println("Enter size of second array:");
		int secondArrSize = sc.nextInt();
		int[] firstArray = new int[firstArrSize];
		int[] secondArray = new int[secondArrSize];
		boolean flag = true;
		System.out.println("Enter members of first array:");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = sc.nextInt();
		}
		System.out.println("Enter members of second array:");
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = sc.nextInt();
		}
		if(firstArray.length != secondArray.length){
			flag = false;
		}
		else{
			for (int i = 0; i < firstArray.length; i++) {
				if(firstArray[i] != secondArray[i]){
					flag = false;
					break;
				}
			}
		}
		if(flag == true){
			System.out.println("Arreys are equal!");
		}
		else{
			System.out.println("Arreys are not equal!");
		}
	}

}
