import java.util.Scanner;

public class NumberDivideDigits11 {

	public static void main(String[] args) {
		System.out.println("Enter three-digit number, neither digit to be 0:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<100 || number >999){
			System.out.println("Please enter three digit number");
			number = sc.nextInt();
		}
		int firstDigit = number/100;
		int secondDigit = (number/10)%10;
		int thirdDigit = number%10;
		while(firstDigit == 0 || secondDigit == 0 || thirdDigit == 0){
			System.out.println("Neither digit must be 0!Please enter valid number");
			number = sc.nextInt();
			while(number<100 || number >999){
				System.out.println("Please enter three digit number");
				number = sc.nextInt();
			}
			firstDigit = number/100;
			secondDigit = (number/10)%10;
			thirdDigit = number%10;
		}
		if((number%firstDigit == 0) && (number%secondDigit == 0) && (number%thirdDigit == 0)){
			System.out.println("Number " + number + " is divisible to all of its digits");
		}else{
			System.out.println("Number " + number + " is not divisible to all of its digits");
		}
	}

}
