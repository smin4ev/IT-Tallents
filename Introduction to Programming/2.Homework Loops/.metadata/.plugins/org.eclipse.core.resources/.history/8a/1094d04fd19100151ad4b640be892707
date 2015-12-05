import java.util.Scanner;

public class Triangle11 {

	public static void main(String[] args) {
		System.out.println("Enter a positive number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int stars = 1;
		int space = 0;
		while(number<1){
			System.out.println("Please enter a positive number:");
			number = sc.nextInt();
		}
		//For solid triangle
		for(int i = 0; i<number; i++){
				for (int z = 0; z < (number-1)-space; z++) {
					System.out.print(" ");
				}
				for (int z = 0; z <stars ; z++) {
					System.out.print("*");
				}
				for (int z = 0; z <(number-1)-space; z++) {
					System.out.print(" ");
				}
				space++;
				stars= stars+2;
			System.out.println();
		}
		//For stable of christmas tree (tree is triangle + stable
//		for (int i = 0; i < number; i++) {
//			for (int j = 0; j < number-1; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			System.out.println();
//		}
//		System.out.println();
		
		//For triangle just with borders
			int freeZone=1;
			int zoneBetweenStars = 1;
			
			for (int i = 0; i < number-1; i++) {
				System.out.print(" ");
			} 
			
			System.out.print("*");
			for (int i = 0; i < number-1; i++) {
				System.out.print(" ");
			}
			System.out.println();
			
			for (int i = 0; i < number-2; i++) {
				for (int j = 0; j <(number-1)-freeZone; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 0; j <zoneBetweenStars; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 0; j <(number-1)-freeZone; j++) {
					System.out.print("");
				}
				freeZone++;
				zoneBetweenStars=zoneBetweenStars+2;
				System.out.println();
			}
			for (int i = 0; i < 2*number-1; i++) {
				System.out.print("*");
			}
	}

}
