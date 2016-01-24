import java.util.Scanner;

public class LongestWordAndNumberOfWords7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word separated with intervals:");
		String words = sc.nextLine();
		int counterWords = 0;
		int currentWordLength = 0;
		int countOfSymbolsInLongestWord = 0;
		for (int i = 0; i < words.length(); i++) {
			if(words.charAt(i) != ' '){
				currentWordLength++;
			} 
			if(words.charAt(i) == ' '  || i == words.length()-1 ){
				counterWords++;
				int helper = currentWordLength;
				currentWordLength = 0;
				if(helper>=countOfSymbolsInLongestWord){
					countOfSymbolsInLongestWord = helper;
				}
			}
			
		}
		System.out.println("Words in this string are " + counterWords);
		System.out.println("Longest word has " + countOfSymbolsInLongestWord + " symbols" );
		
	}

}
