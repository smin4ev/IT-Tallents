import java.util.Scanner;

public class NearestNumberToTheAverageValue10 {

	public static void main(String[] args) {
		//Ще направя задачата с числа с плаваща запетайка, а не с цели, за да се получи по-коректен отговор!
		Scanner sc = new Scanner(System.in);
		float sumOfArray = 0;
		float nearestNum = 0;
		float nearestValueToAverage = Float.MAX_VALUE;
		float[] array = new float[7];
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
			sumOfArray = sumOfArray + array[i];
		}
		float average = sumOfArray/(array.length);
		System.out.println("Average value of the array is: " + average);
		
		for (int i = 0; i < array.length; i++) {
			float temp = Math.abs(average - array[i]);
			if(temp<nearestValueToAverage){
				nearestValueToAverage = temp;
				nearestNum = array[i];
			}
		}
		System.out.println("Nearest number to the average value is: " + nearestNum);
	}
		
}
