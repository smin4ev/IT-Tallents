import java.util.Scanner;

public class ReverseNumberWithStringAndRecursion5 {

	public static String reverseStringNum(String number){
		if(number.length()<=1){
			return number;
		}
		return reverseStringNum(number.substring(1)) + number.charAt(0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String number = sc.nextLine();
		String result = reverseStringNum(number);
		System.out.println(result);
		boolean isPalindrom = number.equals(result);
		if(isPalindrom){
			System.out.println("Number is palindrome!");
		}
		else{
			System.out.println("Number is not palindrome!");
		}
		
	}

}
