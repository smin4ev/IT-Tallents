import java.util.Scanner;

public class SumOfNumbersFrom1ToN15 {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int sumOfNumbers = 0;
		int i = 1;
		if(number>1){
			do {
				sumOfNumbers = sumOfNumbers+i;
				i++;
						
			} while (i<=number);
		}
		else 
			if(number<=1){
				do{
					sumOfNumbers = sumOfNumbers+i;
					i--;
				} while(i>=number);
			}
		System.out.println("Sum of numbers from 1 to " + number + " is " + sumOfNumbers );
	}

}
