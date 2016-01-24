import java.util.Scanner;

public class ManipulationWithArrayMembers16 {

	public static void main(String[] args) {
		//Според условието ако елементът е < -0.231, елементът трябва да се смени със сумата от индекса на елемента на квадрат 
		//+ 41.25, но в примера е даден отговор получен не с номера на индекса, а с поредния номер в масива(ако индекса е 1, 
		//поредния номер е 2). Ще направя задачата с индекса на елемента в масива.
		Scanner sc = new Scanner(System.in);
		float[] array = new float[10];
		float sum = 0;
		float counterOfNumbers = 0;
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] < -0.231){
				array[i] = (float) (i*i + 41.25);
			}
			else {
				array[i] = (i+1)*array[i];
			}
		}
		System.out.println("New elements of the arrays are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if(array[i] != 0){
				sum = sum + array[i];
				counterOfNumbers++;
			}
		}
		System.out.println();
		System.out.println("Average value of non zero elements is " + sum/counterOfNumbers);
	}

}
