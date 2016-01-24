import java.util.Scanner;

public class ArithmeticWithTwoNumbers2 {

	public static void main(String[] args) {
	/*	System.out.println("Enter two different integer numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		while(firstNum == secondNum){
			System.out.println("Please enter not-equal numbers:");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
		}
		
		int sum = firstNum+secondNum;
		int diff = firstNum - secondNum;
		int product = firstNum*secondNum;
		int intDiv = firstNum/secondNum;
		int rem = firstNum%secondNum;
		System.out.println("Amount is " + sum + ", difference by subtracting is " + diff + 
				", product is " + product + ", integer division is " + intDiv + 
				" and division with remainder is " +rem);*/

		System.out.println("Enter two differnt floating point numbers:");
		Scanner scan = new Scanner(System.in);
		double fNum = scan.nextDouble();
		double sNum = scan.nextDouble();
		while(fNum == sNum){
			System.out.println("Please enter not-equal numbers:");
			fNum = scan.nextDouble();
			sNum = scan.nextDouble();
		}
		
		double suma = fNum+sNum;
		double differ = fNum - sNum;
		double prod = fNum*sNum;
		double intDivis = fNum/sNum;
		double remainder = fNum%sNum;
		System.out.println("Amount is " + suma + ", difference by subtracting is " + differ + 
				", product is " + prod + ", integer division is " + intDivis + 
				" and division with remainder is " +remainder);
		
	}

}
