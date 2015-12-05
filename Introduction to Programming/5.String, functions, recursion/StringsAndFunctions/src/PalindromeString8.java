import java.util.Scanner;

public class PalindromeString8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String stringForCheck = sc.nextLine();
		boolean isPalindrome = true;
		for (int i = 0; i < stringForCheck.length()/2; i++) {
			if(stringForCheck.charAt(i) == stringForCheck.charAt(stringForCheck.length()-1-i)){
				continue;
			}
			else{
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome == true){
			System.out.println("String is palindrome!");
		}
		else{
			System.out.println("String is not palindrome!");
		}

		
		
		
	}

}
