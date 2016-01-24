import java.util.Scanner;

public class JuggedSequenceInArray17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter array size >1:");
		int arraySize = sc.nextInt();
		while(arraySize<1){
			System.out.println("Array size must be >1! Please enter valid value:");
			arraySize = sc.nextInt();
		}
		int[] array = new int[arraySize];
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 1; i < array.length-1; i++) { 
			if(i%2 == 1){
				if((array[i-1] < array[i]) && (array[i] > array[i+1])){
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
		}
		if(flag == true){
			System.out.println("Elements of the array are jugged!");
		}
		else{
			System.out.println("Elements of the array are not jugged!");
		}
	}

}
