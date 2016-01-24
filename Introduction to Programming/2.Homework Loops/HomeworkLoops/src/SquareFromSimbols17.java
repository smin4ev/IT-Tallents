import java.io.IOException;
import java.util.Scanner;

public class SquareFromSimbols17 {
	public static void main(String[] args){
		System.out.println("Enter a number in interval[3;20] that will be lenght of square side:");
		Scanner sc = new Scanner(System.in);
		int sideLenght = sc.nextInt();
		while(sideLenght<3 || sideLenght>20){
			System.out.println("Please enter a number in interval [3;20]");
			sideLenght = sc.nextInt();
		}
		System.out.println("Enter simbol for square filling(If you enter more than 1 simbol,"
				+ "only first will be used):");
		char simbol = sc.next().charAt(0);
		for (int i = 0; i < sideLenght; i++) {
			if((i == 0) || (i == sideLenght-1)){
				for (int j = 0; j < sideLenght; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				System.out.print("*");
				for (int j = 0; j < sideLenght-2; j++) {
					System.out.print(simbol);
				}
				System.out.println("*");
			}
			System.out.println();
		}
		
	}
	
}
