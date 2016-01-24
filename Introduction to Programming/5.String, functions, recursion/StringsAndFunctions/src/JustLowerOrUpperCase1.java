import java.util.Scanner;

public class JustLowerOrUpperCase1 {
	public static void printOnlyLowerOrUpperCases(String first, String second ){
		System.out.println("First string just with upper: "+first.toUpperCase());
		System.out.println("First string just with lower: "+first.toLowerCase());
		System.out.println("Second string just with upper: "+second.toUpperCase());
		System.out.println("Second string just with lower:"+second.toLowerCase());
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings no longer than 40 symbols:");
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		while(firstString.length()>40 || secondString.length()>40){
			System.out.println("Please enter strings no longer than 40 symbols");
			firstString = sc.nextLine();
			secondString = sc.nextLine();
		}
		printOnlyLowerOrUpperCases(firstString, secondString);
	}
}
