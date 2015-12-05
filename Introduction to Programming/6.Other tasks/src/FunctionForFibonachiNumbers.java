import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class FunctionForFibonachiNumbers {

	public static int fibonachiNumber(int n){
		if(n==1 || n==2){
			return 1;
		}
		
		int firstNum = 1;
		int secondNum = 1;
		int temp = 0;
		for (int i = 3; i <= n; i++) {
			temp = secondNum;
			secondNum = firstNum+secondNum;
			firstNum = temp;
		}
		return secondNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int result = fibonachiNumber(number);
		System.out.println(result);
		
	}

}
