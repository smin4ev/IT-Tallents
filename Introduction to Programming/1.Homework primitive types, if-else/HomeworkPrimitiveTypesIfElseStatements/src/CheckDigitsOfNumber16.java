import java.util.Scanner;

public class CheckDigitsOfNumber16 {

	public static void main(String[] args) {
		System.out.println("Enter a three digit number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<100 || number>999){
			System.out.println("Please enter three digit number:");
			number = sc.nextInt();
		}
		
		int firstDigit = number/100;
		int secondDigit = (number/10)%10;
		int thirdDigit = number%10;
		
		if(firstDigit == secondDigit && secondDigit == thirdDigit){
			System.out.println("Digits are equal!");
		}else 
			if(firstDigit>secondDigit && secondDigit>thirdDigit){
			System.out.println("Digits are in descending order!");
		}else 
			if(firstDigit<secondDigit && secondDigit<thirdDigit){
			System.out.println("Digits are in ascending order!");
		}else{
			System.out.println("Digits are disordered!");
		}
	}

}
