import java.util.Scanner;

public class PlayingCards21 {

	public static void main(String[] args) {
		
		System.out.println("Enter a card number for start of sequence:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("2 спатия, ");
		case 2:
			System.out.println("2 каро, ");
		case 3:
			System.out.println("2 купа, ");
		case 4:
			System.out.println("2 пика, ");
		case 5:
			System.out.println("3 спатия, ");
		case 6:
			System.out.println("3 каро, ");
		case 7:
			System.out.println("3 купа, ");
		case 8:
			System.out.println("3 пика, ");
		case 9:
			System.out.println("4 спатия, ");
		case 10:
			System.out.println("4 каро, ");
		case 11:
			System.out.println("4 купа, ");
		case 12:
			System.out.println("4 пика, ");
		case 13:
			System.out.println("5 спатия, ");
		case 14:
			System.out.println("5 каро, ");
		case 15:
			System.out.println("5 купа, ");
		case 16:
			System.out.println("5 пика, ");	
		case 17:
			System.out.println("6 спатия, ");
		case 18:
			System.out.println("6 каро, ");
		case 19:
			System.out.println("6 купа, ");
		case 20:
			System.out.println("6 пика, ");
		case 21:
			System.out.println("7 спатия, ");
		case 22:
			System.out.println("7 каро, ");
		case 23:
			System.out.println("7 купа, ");
		case 24:
			System.out.println("7 пика, ");
		case 25:
			System.out.println("8 спатия, ");
		case 26:
			System.out.println("8 каро, ");
		case 27:
			System.out.println("8 купа, ");
		case 28:
			System.out.println("8 пика, ");
		case 29:
			System.out.println("9 спатия, ");
		case 30:
			System.out.println("9 каро, ");
		case 31:
			System.out.println("9 купа, ");
		case 32:
			System.out.println("9 пика, ");	
		case 33:
			System.out.println("10 спатия, ");
		case 34:
			System.out.println("10 каро, ");
		case 35:
			System.out.println("10 купа, ");
		case 36:
			System.out.println("10 пика, ");
		case 37:
			System.out.println("вале спатия, ");
		case 38:
			System.out.println("вале каро, ");
		case 39:
			System.out.println("вале купа, ");
		case 40:
			System.out.println("вале пика, ");	
		case 41:
			System.out.println("дама спатия, ");
		case 42:
			System.out.println("дама каро, ");
		case 43:
			System.out.println("дама купа, ");
		case 44:
			System.out.println("дама пика, ");
		case 45:
			System.out.println("поп спатия, ");
		case 46:
			System.out.println("поп каро, ");
		case 47:
			System.out.println("поп купа, ");
		case 48:
			System.out.println("поп пика, ");	
		case 49:
			System.out.println("асо спатия, ");
		case 50:
			System.out.println("асо каро, ");
		case 51:
			System.out.println("асо купа, ");
		case 52:
			System.out.println("асо пика");
			break;
		default:
			System.out.println("No such card in one deck of cards!");
			break;
		}
		
	}

}
