import java.util.Scanner;

public class ChangeBitsAtPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int newNumChangeFirstBit = (number ^ (1<<a));
		int newNumChangeSecondBit = (newNumChangeFirstBit ^ (1<<b));
		System.out.println(newNumChangeFirstBit);
		System.out.println(newNumChangeSecondBit);
		
		//Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		
//		for (int i = 1; i <= row; i++) {
//			for (int j = i*10 +1 ; j <i*10 + 1 + col ; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		
	}

}
