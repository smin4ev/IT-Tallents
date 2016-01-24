import java.util.Scanner;

public class SumOfEvenNumbersFrom1ToN {

	public static int sumOfEvenNumbers(int num){
		if(num == 2){
			return 2;
		}
		if(num<2){
			return 0;
		}
		if(num%2 == 1){
			return sumOfEvenNumbers(num-1);
		}
		return num + sumOfEvenNumbers(num-2);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int result = sumOfEvenNumbers(number);
		System.out.println(result);
	}

}
