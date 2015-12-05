import java.util.Scanner;

public class ReverseNumberWithRecursion5
{
	 static int counter = 0;
	public static int reverseNum(int number){
		if(number < 1){
			return 0;
		}
		int temp = number%10;
		return (int) (reverseNum(number/10) + temp*Math.pow(10, counter++));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for reversing");
		int number = sc.nextInt();
		int result = reverseNum(number);
		System.out.println(result);
		if(number == result){
			System.out.println("Number is palindrome!");
		}
		else{
			System.out.println("Number is not palindrome!");
		}
	}

}
