import java.util.Scanner;

public class NumbersMultiplesToTwoThreeOrFive22 {

	public static void main(String[] args) {
		System.out.println("Enter number in interval [1;999]");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<1 || number >999){
			System.out.println("Please enter number in interval [1;999]");
			number = sc.nextInt();
		}
		int counterOfNumbers = 1;
		while(counterOfNumbers<=10){
			if((number%2 == 0) || (number%3 == 0) || (number%5 == 0)){
				System.out.print(counterOfNumbers + ":" + number + ",");
				counterOfNumbers++;
			}
			number++;
		}
	}

}
