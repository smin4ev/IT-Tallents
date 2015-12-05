import java.util.Scanner;

public class SumOfNumbersWithRecursion1 {

	public static int sumOfNumbers(int n){
		if(n==0){
			return 0;
		}
		int result = n + sumOfNumbers(n-1);
		//System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sumOfNumbers(num));

	}

}
