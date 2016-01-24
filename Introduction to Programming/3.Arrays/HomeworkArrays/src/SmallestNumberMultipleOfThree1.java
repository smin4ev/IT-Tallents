import java.util.Scanner;

public class SmallestNumberMultipleOfThree1 {
	public static void main(String[] args){
		int[] array = new int[10];
		int min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers in array:");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
			if(array[index] % 3 == 0){
				if(array[index]<min){
					min = array[index];
				}
			}
		}
		
		if(min == Integer.MAX_VALUE){
			System.out.println("There is no number multiple by 3 in the array!");
		} else {
		System.out.println("Number with minimal value multiple by 3 is " + min);
		}
		
		
		
	}
}
