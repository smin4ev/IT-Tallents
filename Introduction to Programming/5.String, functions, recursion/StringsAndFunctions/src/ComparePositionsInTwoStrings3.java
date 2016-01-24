import java.util.Scanner;
public class ComparePositionsInTwoStrings3 {
	
	public static void comparePositions(String first, String second){
		if(first.length()<second.length()){
			System.out.println("Second string is longer than first string!");
			System.out.println("Difference at positions:");
			for (int i = 0; i < first.length(); i++) {
				if(first.charAt(i) != second.charAt(i)){
					System.out.println(i +":"+ first.charAt(i)+ "-"+second.charAt(i));
				}
			}
		}
		
		if(first.length()>second.length()){
			System.out.println("First string is longer than second string!");
			System.out.println("Difference at positions:");
			for (int i = 0; i < second.length(); i++) {
				if(first.charAt(i) != second.charAt(i)){
					System.out.println(i +":"+ first.charAt(i)+ "-"+second.charAt(i));
				}
			}
		}
		
		if(first.length()==second.length()){
			System.out.println("Two strings are with equal length!");
			System.out.println("Difference at positions:");
			for (int i = 0; i < first.length(); i++) {
				if(first.charAt(i) != second.charAt(i)){
					System.out.println(i +":"+ first.charAt(i)+ "-"+second.charAt(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
	
		comparePositions(firstString, secondString);
		
		
		
	}

}
