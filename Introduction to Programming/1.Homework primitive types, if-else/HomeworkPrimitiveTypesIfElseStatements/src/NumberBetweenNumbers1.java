import java.util.Scanner;

public class NumberBetweenNumbers1 {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		double firstNum = sc.nextDouble();
		double secondNum = sc.nextDouble();
		System.out.println("Enter a number for check:");
		double numForCheck = sc.nextDouble();
		
		if(firstNum<secondNum){
			if(firstNum<numForCheck && numForCheck<secondNum){
				System.out.println(numForCheck + " is between entered numbers!");
			}
			else {
				System.out.println(numForCheck + " is not between entered numbers!");
			}
		} else if(firstNum>secondNum){
			if(firstNum>numForCheck && numForCheck>secondNum){
				System.out.println(numForCheck + " is between entered numbers!" );
			} 
			else{
				System.out.println(numForCheck + " is not between entered numbers!");
			}
		} 
		
		else{
			System.out.println("Entered numbers are equal!");
		}
	}

}
