import java.util.Scanner;

public class SumOfDigitsInNumber13 {

	public static void main(String[] args) {
		System.out.println("Enter a number for check sum of digits:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<2 || number>27){
			System.out.println("Sum of numbers must be in interval [2;27].Enter correct number:");
			number = sc.nextInt();
		}
		for (int i = 100; i < 1000; i++) {
			int firstNum = i/100;
			int secondNum = (i/10)%10;
			int thirdNum = i%10;
			
			if(firstNum+secondNum+thirdNum == number){
				System.out.print(i+ ",");
			}
		}
		
		
	}

}
