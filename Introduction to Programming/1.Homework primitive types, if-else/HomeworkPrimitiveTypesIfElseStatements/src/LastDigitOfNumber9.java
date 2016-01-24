import java.util.Scanner;

public class LastDigitOfNumber9 {

	public static void main(String[] args) {
		System.out.println("Enter two two-digit numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		while(firstNum<10 || firstNum>99 || secondNum <10 || secondNum>99){
			System.out.println("Each number must be two-digit!Please enter correct numbers:");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
		}
		
		int product = firstNum*secondNum;
		int lastDigitOfProduct = product%10;
		System.out.println("Product of numbers is " + product + " and last digit is " + lastDigitOfProduct);
		if(lastDigitOfProduct%2 == 0){
			System.out.println("Last digit is even!");
		} else{
			System.out.println("Last digit is odd!");
		}
		
	}

}
