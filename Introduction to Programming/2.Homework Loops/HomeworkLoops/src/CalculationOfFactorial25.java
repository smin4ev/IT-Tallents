import java.util.Scanner;

public class CalculationOfFactorial25 {

	public static void main(String[] args) {
	System.out.println("Enter a positive number:");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int product = 1;
	while(number<1){
		System.out.println("Please enter a positive number:");
		number =sc.nextInt();
	}
	while(number>=1){
		product = product*number;
		number--;
	}
	System.out.println(product);
	}
}
