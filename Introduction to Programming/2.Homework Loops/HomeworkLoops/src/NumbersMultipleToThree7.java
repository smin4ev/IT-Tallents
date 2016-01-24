import java.util.Scanner;

public class NumbersMultipleToThree7 {
	public static void main(String[] args){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 3; i <=3*number ; i=i+3) {
			System.out.print(i+",");
		}
	}
}
