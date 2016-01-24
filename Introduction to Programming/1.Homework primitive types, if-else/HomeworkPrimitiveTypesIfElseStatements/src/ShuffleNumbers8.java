import java.util.Scanner;

public class ShuffleNumbers8 {

	public static void main(String[] args) {
		System.out.println("Enter a fourdigit number in interval from 1000 to 9999:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<1000 || number>9999){
			System.out.println("Please enter a valid number");
			number = sc.nextInt();
		}
		int firstNum = number/1000;
		int fourtNum = number%10;
		int secondNum = (number/100)%10;
		int thirdNum = (number/10)%10;
//		System.out.println(firstNum);
//		System.out.println(secondNum);
//		System.out.println(thirdNum);
//		System.out.println(fourtNum);
		
		int firstDualNumber = firstNum*10 + fourtNum;
		int secondDualNumber = secondNum*10 + thirdNum;
		if(firstDualNumber<secondDualNumber){
			System.out.println("First number is lower than second number:" + firstDualNumber + "<" + secondDualNumber);
		} else 
			if(firstDualNumber>secondDualNumber){
			System.out.println("First number is biger than second number:" + firstDualNumber + ">" + secondDualNumber);
		} else{
			System.out.println("Numbers are equal!");
		}
	}

}
