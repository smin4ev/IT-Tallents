import java.util.Scanner;

public class WordsWithCapitalFirstLetter6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with a few words and interval between them:");
		String sentence = sc.nextLine();
		//Премахваме празните интервали в началото и края
		sentence = sentence.trim();
		//Прави първата буква от изречението главна
		sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
		for(int i = 0; i<sentence.length(); i++){
			if(sentence.charAt(i) == ' '){
				sentence = sentence.substring(0,i+1) + sentence.substring(i+1,i+2).toUpperCase()+ sentence.substring(i+2);
			}
		}
		System.out.println(sentence);
		
		
		
		
	}

}
