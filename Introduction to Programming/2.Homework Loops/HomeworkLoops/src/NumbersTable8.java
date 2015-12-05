import java.util.Scanner;

public class NumbersTable8 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int displacements = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				
					System.out.print(number-1+displacements);
		}
			System.out.println();
			displacements = displacements+2;
	}
	}
}
