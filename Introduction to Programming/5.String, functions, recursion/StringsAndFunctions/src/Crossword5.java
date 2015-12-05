import java.util.Scanner;

public class Crossword5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings:");
		String verticalString = sc.nextLine();
		String horizontalString = sc.nextLine();
		
		boolean hasCommonChar = false;
		for(int i = 0; i<verticalString.length(); i++){
			if(verticalString.charAt(i) == horizontalString.charAt(0)){
				hasCommonChar = true;
				break;
			}
		}
		if(hasCommonChar==true){
			for (int i = 0; i < verticalString.length(); i++) {
				if(verticalString.charAt(i) == horizontalString.charAt(0)){
					System.out.println(horizontalString);	
				}
				else{
					System.out.println(verticalString.charAt(i));
				}
			}
		}
		if(hasCommonChar == false){
			System.out.println("There was no common char in vertical string "
					+ "and in the beginning of horizontal string");
		}
	}
}
