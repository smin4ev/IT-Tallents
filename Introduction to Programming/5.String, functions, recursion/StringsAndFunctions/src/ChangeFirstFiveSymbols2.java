import java.util.Scanner;

public class ChangeFirstFiveSymbols2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings longer than 6 symbols, but not more 20 symbols:");
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		while(firstString.length()<6 || firstString.length()>20 || secondString.length()<6 
				|| secondString.length()>20){
			System.out.println("Please enter strings according task requirements:" );
			firstString = sc.nextLine();
			secondString = sc.nextLine();
		}
		
		
		String firstFiveFirstStr = firstString.substring(0,5);
		String firstFiveSecondStr = secondString.substring(0,5);
		
		firstString = firstString.replace(firstFiveFirstStr, firstFiveSecondStr);
		secondString = secondString.replace(firstFiveSecondStr, firstFiveFirstStr);
		
		System.out.println("After change of first five symbols to each other new strings are:");
		System.out.println(firstString);
		System.out.println(secondString);
		int firstLen = firstString.length();
		int secondLen = secondString.length();
		if(firstLen>=secondLen){
			System.out.println("Longer string is "+firstString +":" + firstLen + " symbols");
		}
		else{
			System.out.println("Longer string is " + secondString + ":" + secondLen + " symbols");
		}
	}
}
