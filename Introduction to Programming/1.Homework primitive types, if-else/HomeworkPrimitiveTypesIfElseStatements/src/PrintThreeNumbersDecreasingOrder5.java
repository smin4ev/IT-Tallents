import java.util.Scanner;

public class PrintThreeNumbersDecreasingOrder5 {

	public static void main(String[] args) {
		System.out.println("Enter three different numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int thirdNum = sc.nextInt();
		
		while((firstNum == secondNum) || (secondNum == thirdNum) ||(firstNum == thirdNum)){
			System.out.println("Please enter three different numbers:");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
			thirdNum = sc.nextInt();
		}
		if((firstNum>secondNum) && (secondNum>thirdNum)){
			System.out.println(firstNum + ", " + secondNum + ", " + thirdNum);
		} else 
			if((firstNum>secondNum) && (thirdNum>secondNum) && (firstNum>thirdNum)){
			System.out.println(firstNum + ", " + thirdNum + ", " + secondNum);
		} else 
			if((firstNum>secondNum) && (thirdNum>secondNum) && (firstNum<thirdNum)){
			System.out.println(thirdNum + ", " + firstNum + ", " + secondNum);
		} else 
			if((secondNum>firstNum) && (secondNum>thirdNum) & (firstNum>thirdNum)){
			System.out.println(secondNum + ", " + firstNum + ", " + thirdNum);
		} else 
			if((secondNum>firstNum) && (secondNum>thirdNum) & (firstNum<thirdNum)){
			System.out.println(secondNum + ", " + thirdNum + ", " + firstNum);
		} else {
			if((firstNum<secondNum) && (secondNum<thirdNum)){
			System.out.println(thirdNum + ", " + secondNum + ", " + firstNum);
		}	
		}
	}

}
