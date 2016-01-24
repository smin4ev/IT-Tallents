import java.util.Scanner;

public class PalindromeOrNot24 {

	public static void main(String[] args) {
		System.out.println("Enter a number in interval [10; 30000]");
		Scanner sc = new Scanner(System.in);
		int numberForCheck = sc.nextInt();
		int reverseNumber = 0;
		
		while(numberForCheck<10 || numberForCheck>30000){
			System.out.println("Please enter a number according task requirements: ");
			numberForCheck = sc.nextInt();
		}
		int numberForIterations = numberForCheck;
		
		do {
			int currentDigit = numberForIterations%10;
			reverseNumber = reverseNumber*10+currentDigit;
			numberForIterations = numberForIterations/10;
			
		} while (numberForIterations>0);
		
		
		if(numberForCheck == reverseNumber){
			System.out.println("Entered number is palindrome");
		}
		else{
			System.out.println("Entered number is not palindrome");
		}
	}

}
