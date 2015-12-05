import java.util.Scanner;

public class IsPrimeRecursion3 {
	
	public static int primeNumber(int number, int devider){

		if(devider == 1){
		    return 1;
		}
		if(number == 1 || number == 2 ){
			return 1;
		}
		if(number%devider == 0){
			return 0;
		}
		return primeNumber(number, devider-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check is prime:");
		int number = sc.nextInt();
		int devider = number/2+1;
		int result = primeNumber(number, devider);
		
		if(result == 1){
			System.out.println("Number is prime");
		}
		if(result == 0){
			System.out.println("Number is not prime");
		}
		
	}

}
