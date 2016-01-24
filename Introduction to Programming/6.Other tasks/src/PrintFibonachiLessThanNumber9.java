import java.util.Scanner;

public class PrintFibonachiLessThanNumber9 {

	public static void printFibonachiNumbersLessThanNum(int num){
		int sum = 1;
		int firstNum = 0;
		int secondNum = 1;
		if(num<=0){
			return;
		}
		if(num == 1){
			System.out.println(firstNum);
			System.out.println("sum= " + firstNum);
			return;
		}
		if(num == 2){
			System.out.println(firstNum + " " + secondNum);
			System.out.println("sum= " + secondNum);
			return;
		}
		System.out.print(firstNum + " " + secondNum + " ");
		for (int i = 3; i <=num ; i++) {
			int temp = secondNum;
			secondNum = firstNum+secondNum;
			firstNum = temp;
			sum = sum+secondNum;
			System.out.print(secondNum + " ");		
		}
		System.out.println();
		System.out.println("sum= " + sum);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		printFibonachiNumbersLessThanNum(number);

	}

}
