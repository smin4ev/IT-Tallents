import java.util.Scanner;
import java.util.stream.IntStream;

public class NewStringMadeByExistingPlus5ASCII10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string for manipulation:");
		String entryString = sc.nextLine();
		String outString = "";
		StringBuilder builder = new StringBuilder();
		char currentSymbol;
		for (int i = 0; i < entryString.length(); i++) {
			currentSymbol =  (char) (entryString.charAt(i) + 5);
			builder = builder.append(currentSymbol);
			//outString = outString+currentSymbol;
		}
		
		System.out.println("New string after adding 5 to ASCII code of each symbol is "+builder);
		
	}
}
;