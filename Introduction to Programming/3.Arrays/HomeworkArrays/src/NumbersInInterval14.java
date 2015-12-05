import java.util.Scanner;

public class NumbersInInterval14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize = sc.nextInt();
		while(arrSize<1){
			System.out.println("Size of array must be > 1! Enter valid size:");
			arrSize = sc.nextInt();
		}
		float[] array = new float[arrSize];
		System.out.println("Enter members of array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		System.out.println("Numbers in interval [-2.99; 2.99] are: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i]>-2.99 && array[i]<2.99){
				System.out.print(array[i] + " ");
			}
		}
	}

}
